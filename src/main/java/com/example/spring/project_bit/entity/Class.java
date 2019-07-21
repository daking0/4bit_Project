package com.example.spring.project_bit.entity;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="Class")
public class Class implements Serializable {

    @Id
    @Column(name = "class_UUID", nullable = false, updatable = false)
    private UUID classId;

    @Column(name = "class_name")
    private String className;

    @Column(name = "class_start_date")
    private Date startedDate;

    @Column(name = "class_end_date")
    private Date endedDate;

    @Column(name = "branch_code")
    @JoinColumn(name = "branch_code", referencedColumnName = "branch_code")
    private String branchCode;

    public UUID getClassId() {
        return classId;
    }

    public void setClassId(UUID classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getEndedDate() {
        return endedDate;
    }

    public void setEndedDate(Date endedDate) {
        this.endedDate = endedDate;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}
