package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "st_test_answer")
public class St_Test_Answer implements Serializable {

    @Column(name = "student_id")        //fk(Student)
    private int studentId;

    @Column(name = "test_id")           //fk(Test)
    private int testId;

    @Column(name = "st_answer")         //JSON 타입임. 수정해야됨
    private String stAnswer;

}
