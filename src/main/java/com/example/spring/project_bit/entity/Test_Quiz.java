package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "test_quiz")
public class Test_Quiz implements Serializable {

    @Column(name = "test_id")       //fk(Test)
    private int testId;

    @Column(name = "quiz_id")       //fk(Quiz)
    private int quizId;
}
