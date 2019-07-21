package com.example.spring.project_bit.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "student")
@DynamicInsert
public class Student implements Serializable {

    @Id
    @Column(columnDefinition = "BIGINT", name = "student_UUID", updatable = false, nullable = false)
    private UUID studentId;

    @Column(name = "student_birth", nullable = false)
    private String studentBirth;

    @OneToMany
    @JoinColumn(name = "user_UUID", referencedColumnName = "user_UUID")
    private User userId;

    @OneToMany
    @JoinColumn(name = "class_UUID", referencedColumnName = "class_UUID")
    private Class classId;


    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public String getStudentBirth() {
        return studentBirth;
    }

    public void setStudentBirth(String studentBirth) {
        this.studentBirth = studentBirth;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Class getClassId() {
        return classId;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }


}
