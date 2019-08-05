package com.example.spring.todo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @Column(columnDefinition = "BIGINT", name = "test_id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long testId;

    @Column(name="test_name")
    private String testName;

    @Column(name="test_start_time")
    private Date testStartTime;

    @Column(name="test_end_time")
    private Date testEndTime;

    @Column(name="test_description")
    private String testDescription;

//    class에서 FK
//    @Column(name="test_id")
//    private Class classId;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "test_quiz",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "quiz_id")
    )
    private Set<Privilege> quiz;
}
