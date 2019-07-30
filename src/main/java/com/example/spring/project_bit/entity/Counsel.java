package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "counsel")
public class Counsel implements Serializable {

    @Column(name = "student_id")   // student fk
    private int studentId;

    @Column(name = "teacher_id")   //teacher  fk
    private int teacherId;

    @Column(name = "counsel")
    private String counsel;






}
