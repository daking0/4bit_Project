package com.project_bit.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "HW_Board")
public class HW_Board implements Serializable {

    @Id
    @Column(name = "HW_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long hwBoardUUID;

    @Column(name = "HW_name")
    private String username;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HW_deadLine")
    private Date hwDeadLine;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HW_create_date")
    private Date hwCreateDate;

    @Column(name = "HW_description")
    private String hwDescription;

    @Column(name = "board_UUID")
    private Long boardUUID;

    @Column(name = "class_UUID")
    private Long classUUID;

    public Long getHwBoardUUID() {
        return hwBoardUUID;
    }

    public void setHwBoardUUID(Long hwBoardUUID) {
        this.hwBoardUUID = hwBoardUUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getHwDeadLine() {
        return hwDeadLine;
    }

    public void setHwDeadLine(Date hwDeadLine) {
        this.hwDeadLine = hwDeadLine;
    }

    public Date getHwCreateDate() {
        return hwCreateDate;
    }

    public void setHwCreateDate(Date hwCreateDate) {
        this.hwCreateDate = hwCreateDate;
    }

    public String getHwDescription() {
        return hwDescription;
    }

    public void setHwDescription(String hwDescription) {
        this.hwDescription = hwDescription;
    }

    public Long getBoardUUID() {
        return boardUUID;
    }

    public void setBoardUUID(Long boardUUID) {
        this.boardUUID = boardUUID;
    }

    public Long getClassUUID() {
        return classUUID;
    }

    public void setClassUUID(Long classUUID) {
        this.classUUID = classUUID;
    }
}
