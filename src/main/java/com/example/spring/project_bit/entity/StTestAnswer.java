package com.example.spring.todo.entity;

import javax.persistence.*;

@Entity
@IdClass(TestUser.class)
@Table(name = "st_test_answer")
public class StTestAnswer {

    @Id
    @Column(name = "test_id")
    private Test testId;

    @Id
    @Column(name = "user_id")
    private User userId; // 학생고유번호

    @Column(name="st_answer")
    private int stAnswer;
}