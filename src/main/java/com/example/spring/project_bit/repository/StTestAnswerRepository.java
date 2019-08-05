package com.example.spring.todo.repository;

import com.example.spring.todo.entity.StTestAnswer;
import com.example.spring.todo.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StTestAnswerRepository extends JpaRepository<StTestAnswer, TestUser> {

}
