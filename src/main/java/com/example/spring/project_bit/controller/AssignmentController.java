package com.example.spring.project_bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class AssignmentController {

    // #3-3-st
    @RequestMapping("/class/assignment")
    public void showNowAssignmentList(String id,  Date nowTime){
        // 진행 중인 과제 리스트
        // 제출기간인지 아닌지 비교
    }

    // #3-3-1(read)-st
    @RequestMapping("/class/assignment?hwno={hwno}")
    public void Assignment(String userId, int HWId){
        // 과제 설명 페이지
    }

    // 3-3-1(Read)-1(Update)-t
    @RequestMapping("/class/assignment?hwno={hwno}/edit")
    public void editNowAssignment(String userId, int HWId){
        // 강사가 제출한 과제 수정
    }

    // 3-3-1(read)-2(submit)-s
    @RequestMapping("/class/assignment?hwno={hwno}/submit/edit")
    public void applyAssignment(String userId, int HWId){
        // 과제를 제출하는 페이지
    }

    @RequestMapping("/class/assignment?hwno={hwno}/submit/edit")
    public void submitAssignment(String userId, int HWId){
        // 제출 버튼 클릭 시 실행되는 페이지
    }

    // 3-3-1(read)-3(submit_update)-s
    @RequestMapping("/class/assignment?hwno={hwno}/submit/edit")
    public void studentEditAssignment(String userId, int HWId){
        // 종료되지 않은 과제 학생 수정
    }

    // 3-3-2(Create)-t
    @RequestMapping("/class/assignment/write")
    public void writeNowAssignment(String userId){
        // 강사 과제 출제
    }






    // #4-3-st
    @RequestMapping("/study/endedassignment")
    public void endedAssignmentList(String userId){
        // 지난 과제 리스트
    }

    // 4-3-1(Read)-st
    @RequestMapping("/study/endedassignment?hwno={hwno}")
    public void endedAssignment(String userId, int HWId){
        // 지난 과제 상세
        // 과제 설명
    }

    // 4-3-1(Read)-1(Read)-st
    @RequestMapping("/study/endedassignment?hwno={hwno}&studentid={studentid}")
    public void readEndedAssignmentResult(String userId, int HWId){
        // 학생별 과제 상세
        // 결과보기 클릭 시 실행되는 메서드
    }
}