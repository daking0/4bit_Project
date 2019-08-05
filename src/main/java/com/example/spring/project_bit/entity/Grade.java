package com.example.spring.todo.entity;

import javax.persistence.*;

@Entity
// 복합키 선언 시 개별적 선언이 안 됨
// 두 개의 기본키를 가진 클래스 생성 및 호출
@IdClass(TestUser.class)
@Table(name = "grade")
public class Grade {

    @Id
    @Column(name = "test_id")
    private Test testId;

    @Id
    @Column(name = "user_id")
    private User userId; // 학생고유번호

    @Column(name="st_test_score")
    private int stTestScore;
}
