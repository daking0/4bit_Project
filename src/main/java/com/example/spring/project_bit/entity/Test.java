package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "test")
public class Test implements Serializable {

    @Id
    @Column(name = "test_id")
    private int testId;

    @Column(name = "test_name")
    private String testName;

    @Column(name = "test_start_time")
    private Date testStartTime;

    @Column(name = "test_end_time")
    private Date testEndTime;

    @Column(name = "test_description")
    private String testDescription;

    @Column(name = "board_id")      // fk (Class_Board)
    private String boardId;

    @Column(name = "class_id")       // fk (Class_Board)
    private int classId;

}
