package com.project_bit.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "class_board")
public class ClassBoard {

    @Id
    @Column(name = "board_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long boardUUID;

    @Column(name = "class_UUID")
    private String classUUID;

    public Long getBoardUUID() {
        return boardUUID;
    }

    public void setBoardUUID(Long boardUUID) {
        this.boardUUID = boardUUID;
    }

    public String getClassUUID() {
        return classUUID;
    }

    public void setClassUUID(String classUUID) {
        this.classUUID = classUUID;
    }
}
