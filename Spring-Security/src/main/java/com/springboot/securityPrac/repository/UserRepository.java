package com.springboot.securityPrac.repository;

import com.springboot.securityPrac.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
   Users findByUsername(String username);

}
// **  Encrypting Passwords
// plain -> hash -> hash1 -> hash2 -> hash3

