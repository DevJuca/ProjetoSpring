package com.example.app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.app.entities.Users;
import com.example.app.repositores.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired // Resolve a injeção dependencia de associação de um objeto a outro.
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        Users u1 = new Users(0, "joao", "joao@gmail.com", "1154822545", "123485");
        Users u2 = new Users(0, "Maria", "maria@gmail.com", "1128452454", "54321");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
    
}