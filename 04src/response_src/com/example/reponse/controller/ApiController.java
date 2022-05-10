package com.example.reponse.controller;

import com.example.reponse.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    // JSON
    // request -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user; // 200 ok
    }

    // ResponseEntity<>
    // http status 를 201 로 정해주기
    // user json 으로 내려감
    // 응답에 대한 커스터마이징
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
