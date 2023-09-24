package com.example.springboot7lab.repository;

import com.example.springboot7lab.entity.Role;
import com.example.springboot7lab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail (String email);
}
