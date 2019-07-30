package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "grade")
public class Grade implements Serializable {

    @Column(name = "student_id")        //fk(st_Test_Answer)
    private int studentId;

    @Column(name = "test_id")           //fk(st_Test_Answer)
    private int testId;

    @Column(name = "st_test_score")
    private int stTestScore;

}
