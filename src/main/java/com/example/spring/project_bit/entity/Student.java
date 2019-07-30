package com.example.spring.project_bit.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "student_birth")
    private String studentBirth;

    @Column(name = "user_id")       // User fk
    private int userId;

    @Column(name = "class_id")      // Class fk
    private int classId;

    @Column(name = "roadmap_last")
    private int roadmapLast;


}
