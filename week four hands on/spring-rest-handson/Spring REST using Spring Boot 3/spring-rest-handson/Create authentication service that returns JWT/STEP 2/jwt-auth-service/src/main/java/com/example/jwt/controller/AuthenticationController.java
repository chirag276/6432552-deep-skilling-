package com.example.jwt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        // Get Authorization header
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return "Missing or invalid Authorization header";
        }

        // Decode base64 encoded credentials
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String decodedCredentials = new String(decodedBytes);

        // Split into username and password
        String[] credentials = decodedCredentials.split(":", 2);
        if (credentials.length != 2) {
            return "Invalid Basic Auth format";
        }

        String username = credentials[0];
        String password = credentials[1];

        // Validate against expected (in-memory) user
        if ("user".equals(username) && "pwd".equals(password)) {
            return "User authenticated successfully. Next: generate JWT.";
        } else {
            return "Invalid username or password.";
        }
    }
}


