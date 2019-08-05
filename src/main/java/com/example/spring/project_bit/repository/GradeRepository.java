package com.example.spring.todo.repository;

import com.example.spring.todo.entity.Grade;
import com.example.spring.todo.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, TestUser> {

}
