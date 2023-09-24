package com.example.springboot7lab.repository;

import com.example.springboot7lab.entity.Role;
import com.example.springboot7lab.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
