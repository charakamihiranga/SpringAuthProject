package com.springboot.securityPrac.controller;

import com.springboot.securityPrac.model.Users;
import com.springboot.securityPrac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        System.out.printf("User %s logged in", user);
        return userService.verifyUser(user);
    }

}
