package com.springboot.securityPrac.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JWTService {

    private String secretKey = "";

    public JWTService () {
       try{
           KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
           SecretKey sk  = keyGenerator.generateKey();
              secretKey = Base64.getEncoder().encodeToString(sk.getEncoded());
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .and()
                .signWith(getKey())
                .compact();
    }

    private Key getKey() {
        return Keys.hmacShaKeyFor(secretKey.getBytes());
    }
}
