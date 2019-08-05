package com.example.spring.todo.entity;

import javax.persistence.Column;
import java.io.Serializable;

// 복합키 선언 시 개별적 선언이 안 됨
// 두 개의 기본키를 가진 클래스 생성 및 호출
public class TestUser implements Serializable {

    @Column(name = "test_id")
    private Test testId;

    @Column(name = "user_id")
    private User userId; // 학생고유번호

    public TestUser(){}

    public TestUser(Test testId, User userId){
        this.testId= testId;
        this.userId= userId;
    }
}
