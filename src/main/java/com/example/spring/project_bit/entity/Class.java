package com.example.spring.project_bit.entity;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="class")
public class Class implements Serializable {

    @Id
    @Column(name = "class_id", nullable = false, updatable = false)
    private int classId;

    @Column(name = "class_name")
    private String className;

    @Column(name = "class_start_date")
    private Date startedDate;

    @Column(name = "class_end_date")
    private Date endedDate;

    @Column(name = "branch_code")       //branch fk
    private String branchCode;

}
