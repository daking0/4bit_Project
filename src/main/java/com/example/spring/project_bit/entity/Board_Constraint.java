package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "board_constraint")
public class Board_Constraint implements Serializable {

    @Id
    @Column(name = "constraint_name")
    private String constraintName;

    @Column(name = "constraint_target")
    private String constraintTarget;

    @Column(name = "constraint_size")
    private String constraintSize;

    @Column(name = "constraint_type")
    private String constraintType;

    @Column(name = "board_id")      //fk(board_manager)
    private String boardId;

}
