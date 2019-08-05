package com.example.spring.todo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @Column(columnDefinition = "BIGINT", name = "quiz_id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long quizId;

    @Column(name="quiz_contents")
    private String quizContents;

    @Column(name="quiz_answer")
    private String quizAnswer;

    @Column(name="quiz_each_score")
    private int quizEachScore;

    @Column(name="quiz_subject")
    private String quizSubject;

    @Column(name="quiz_chapter")
    private String quizChapter;

    @Column(name="quiz_level")
    private String quizLevel;

    @Column(name="quiz_answer_type")
    private String quizAnswerType;

    @Column(name="quiz_explain")
    private String quizExplain;

//    User 테이블에서 userId(강사 고유 번호)를 FK로 받음
//    OneToMany, ManyToOne??
//    private  User userId;

    @JsonIgnore
    @ManyToMany(mappedBy = "quiz")
    private Set<Test> test;
}