package com.example.spring.project_bit.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "board_type")
public class BoardType {

    @Id
    @Column(name = "borad_type_code")
    private Long boardTypeCode;

    @Column(name = "board_type_name")
    private String boardTypeName;

    @Column(name = "isnotice")
    private int isNotice;

    public Long getBoardTypeCode() {
        return boardTypeCode;
    }

    public void setBoardTypeCode(Long boardTypeCode) {
        this.boardTypeCode = boardTypeCode;
    }
}
