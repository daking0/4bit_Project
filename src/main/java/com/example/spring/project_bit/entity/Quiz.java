package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "quiz")
public class Quiz implements Serializable {
    @Id
    @Column(name = "quiz_id")
    private int quizId;

    @Column(name = "quiz_number")
    private int quizNumber;

    @Column(name = "quiz_contents")
    private int quizContents;

    @Column(name = "quiz_answer")
    private int quizAnswer;

    @Column(name = "quiz_each_score")
    private int quizEachScore;

    @Column(name = "quiz_subject")
    private int quizSubject;

    @Column(name = "quiz_chapter")
    private int quizChapter;

    @Column(name = "quiz_level")
    private int quizLevel;

    @Column(name = "quiz_answertype")
    private int quizAnswertype;

    @Column(name = "quiz_writer")
    private int quizWriter;

    @Column(name = "quiz_explain")
    private int quizExplain;

}
