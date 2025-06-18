package com.example.app.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
}
