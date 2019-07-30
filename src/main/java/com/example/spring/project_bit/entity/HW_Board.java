package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "hw_board")
public class HW_Board implements Serializable {

    @Id
    @Column(name = "hw_id")
    private int hwId;

    @Column(name = "hw_name")
    private String hwName;

    @Column(name = "hw_deadline")
    private Date hwDeadline;

    @Column(name = "hw_create_date")
    private Date hwCreateDate;

    @Column(name = "hw_subject")
    private String hwSubject;

    @Column(name = "hw_description")
    private String hwDescription;       // TEXT 타입..

    @Column(name = "board_id")
    private String boardId;         //fk (Class_Board)

    @Column(name = "class_id")
    private int classId;
}
