package com.example.springboot7lab.repository;

import com.example.springboot7lab.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName (String name);
}
