package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "board_manager")
public class Board_Manager implements Serializable {

    @Id
    @Column(name = "board_id")
    private String boardId;

    @Column(name = "board_name")
    private String boardName;

    @Column(name = "isnotice")      // enum은 반환형이 String 이라는데..?
    private String isnotice;

}
