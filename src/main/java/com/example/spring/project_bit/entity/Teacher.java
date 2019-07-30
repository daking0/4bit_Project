package com.example.spring.project_bit.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="teacher")
public class Teacher implements Serializable {

    @Id
    @Column(name="teacher_id")
    private int teacherId;

    @Column(name="user_id")     //user fk
    private User userId;

    @Column(name="class_id")        //class fk
    private Class classId;

}
