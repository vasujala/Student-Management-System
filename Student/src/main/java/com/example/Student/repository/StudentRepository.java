package com.example.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
