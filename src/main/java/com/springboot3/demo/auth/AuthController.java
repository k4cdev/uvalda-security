package com.springboot3.demo.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    ResponseEntity<AuthResponse> login(@RequestBody LoginRequest login){
        return ResponseEntity.ok(authService.login(login));
    }

    @PostMapping("/register")
    ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest register){
        return ResponseEntity.ok(authService.register(register));
    }
}
