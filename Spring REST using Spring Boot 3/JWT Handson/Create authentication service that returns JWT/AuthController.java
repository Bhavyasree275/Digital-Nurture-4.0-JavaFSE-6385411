package com.example.jwt.controller;

import com.example.jwt.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        try {
            String header = request.getHeader("Authorization");

            if (header == null || !header.startsWith("Basic ")) {
                return ResponseEntity.status(401).body("{\"error\":\"Missing or invalid Authorization header\"}");
            }

            String base64Credentials = header.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);

            String[] values = credentials.split(":", 2);
            if (values.length != 2) {
                return ResponseEntity.status(400).body("{\"error\":\"Malformed credentials\"}");
            }

            String username = values[0];
            String password = values[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                String token = jwtUtil.generateToken(username);
                return ResponseEntity.ok("{\"token\":\"" + token + "\"}");
            } else {
                return ResponseEntity.status(403).body("{\"error\":\"Invalid credentials\"}");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }
}
