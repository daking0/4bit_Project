package com.project_bit.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Board_Manager")
public class Board_Manager {

    @Id
    @Column(name = "board_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long boardUUID;

    @Column(name = "board_name")
    private String boradName;

    @Column(name = "board_type_code")
    private String boradTypeCode;

    public Long getBoardUUID() {
        return boardUUID;
    }

    public void setBoardUUID(Long boardUUID) {
        this.boardUUID = boardUUID;
    }

    public String getBoradName() {
        return boradName;
    }

    public void setBoradName(String boradName) {
        this.boradName = boradName;
    }

    public String getBoradTypeCode() {
        return boradTypeCode;
    }

    public void setBoradTypeCode(String boradTypeCode) {
        this.boradTypeCode = boradTypeCode;
    }
}
