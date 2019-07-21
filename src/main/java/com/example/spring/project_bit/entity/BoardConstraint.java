package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Board_Constraint")
public class BoardConstraint implements Serializable {

    @Id
    @Column(name="constraint_Name")
    private String constraintName;

    @Column(name = "constraint_target")
    private String constraintTarget;

    @Column(name = "constrint_size")
    private String constraintSize;

    @Column(name = "constraint_type")
    private String constraintType;

    @Column(name = "board_UUID")
    private String boardUUID;


}
