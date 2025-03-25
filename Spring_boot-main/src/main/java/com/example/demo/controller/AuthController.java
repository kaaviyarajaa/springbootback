package com.example.demo.controller;

import com.example.demo.Security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/generate-token")
    public String generateToken(@RequestParam String username) {
        return jwtUtil.generateToken(username);
    }
}