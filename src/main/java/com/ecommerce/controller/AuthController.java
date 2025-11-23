package com.ecommerce.controller;

import com.ecommerce.model.AuthRequest;
import com.ecommerce.model.AuthResponse;
import com.ecommerce.service.JwtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/authentication")
public class AuthController {

    private final JwtService jwtService;

    @GetMapping("/login")
    public ResponseEntity<AuthResponse> generateToken(
            @RequestHeader("username") String username,
            @RequestHeader("password") String password,
            @RequestHeader("x-api-key") String apiKey) {
        log.info("generateToken called");
        AuthRequest authRequest = AuthRequest.builder()
                .username(username)
                .password(password)
                .apiKey(apiKey)
                .build();
        var response = jwtService.generateToken(authRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/validateToken")
    public ResponseEntity<AuthResponse> validateToken(
            @RequestHeader("Authorization") String token,
            @RequestHeader("x-api-key") String apiKey) {
        log.info("validateToken called");
        var response = jwtService.validateToken(token, apiKey);
        return ResponseEntity.ok(response);
    }
}
