package com.example.app.userresource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {
    
    @GetMapping
    public ResponseEntity<Users> users(){
        Users u = new Users(1L, "João", "joao@gmail.com", "1148452274", "12345");
        return ResponseEntity.ok().body(u);
    }
}
