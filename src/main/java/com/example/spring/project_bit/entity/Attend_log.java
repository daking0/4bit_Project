package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.EnumMap;

@Entity
@Table(name = "attend_log")
public class Attend_log implements Serializable {

    @Id
    @Column(name = "event_time")
    private Date eventTime;

    @Column(name = "student_id")      // student fk
    private int studentId;

    @Column(name = "event_name")    //enum
    private String eventName;


}