package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "class_board")
public class Class_Board implements Serializable {

    @Column(name = "board_id")
    private String boardId;         // fk (Board_Manager)

    @Column(name = "class_id")      //fk (Class)
    private String classId;

}
