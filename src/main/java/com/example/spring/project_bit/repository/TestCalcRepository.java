package com.example.spring.todo.repository;

import com.example.spring.todo.entity.TestCalc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCalcRepository extends JpaRepository<TestCalc, Long> {
}
