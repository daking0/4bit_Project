package com.example.spring.project_bit.repository;

import com.example.spring.project_bit.entity.User;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
