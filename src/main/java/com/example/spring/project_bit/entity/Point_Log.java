package com.example.spring.project_bit.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "point_log")
public class Point_Log implements Serializable {

    @Id
    @Column(name="point_event_time")
    private Date pointEventTime;

    @Column(name = "user_id")   // Userid fk
    private int userId;

    @Column(name="point_added")
    private int pointAdded;

    @Column(name="point_from")
    private String pointFrom;

}
