package com.example.spring.todo.entity;

import javax.persistence.*;

@Entity
@Table(name="TestCalc")
public class TestCalc {

    @Id
    @Column(name="test_id") // TestId 주키를 가져오는데~
    private Test testId;

    @Column(name="sum")
    private int sum;

    @Column(name="avg")
    private double avg;

    @Column(name="max")
    private int max;

    @Column(name="min")
    private int min;
}
