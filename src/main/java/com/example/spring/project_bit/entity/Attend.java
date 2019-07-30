package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "attend")
public class Attend implements Serializable {

    @Id
    @Column(name = "student_id")   // student
    private int studentId;

    @Column(name = "attend_count")
    private int attendCount;

    @Column(name = "absent_count")
    private int absentCount;

    @Column(name = "late_count")
    private int lateCount;

    @Column(name = "out_count")
    private int outCount;

    @Column(name = "early_leave_count")
    private int earlyLeaveCount;


}
