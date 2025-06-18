package com.example.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entities.Users;
import com.example.app.repositores.UserRepository;

@Service
public class UserService {
    
    @Autowired // Resolve a injeção dependencia de associação de um objeto a outro.
    private UserRepository repository;

    public List<Users> findAll(){
        return repository.findAll();
    }

    public Users findbyID(Long id){
        Optional<Users> obj = repository.findById(id);
        return obj.get();
        
    }
}
