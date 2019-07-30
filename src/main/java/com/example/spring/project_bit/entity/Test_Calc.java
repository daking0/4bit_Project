package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "test_calc")
public class Test_Calc implements Serializable {

    @Column(name = "test_id")       //fk(Test)
    private int testId;

    @Column(name = "sum")
    private int sum;

    @Column(name = "avg")
    private double avg;

    @Column(name = "max")
    private int max;

    @Column(name = "min")
    private int min;

}
