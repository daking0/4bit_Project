package com.example.spring.project_bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class TestController {

    // #3-2-st
    @RequestMapping("/class/test")
    public void showNowTestList(String userId, Date nowTime){
        // util.judgeUser(String userId)
        // 현재 진행중인 시험 목록 표시
        // 종료시간이 현재시간 이후인지(=아직 안끝났는지)
    }

    // #3-2-2(Create)-t
    @RequestMapping("/class/test/write")
    public void createNowTest(String userId){
        // 새로운 시험 출제
    }

    // #3-2-2(Create)-1(popup)-t
    @RequestMapping("/class/test/exbank")
    public void showExBankList(String userId){
        // 문제은행 문제 리스트 보여줌
        // 과목별, 챕터별, 난이도별 등 정렬해서 보여줄 수 있어야
        // >> 문제 은행 리스트 >> 선택한 문제 번호 리턴
    }

    // #3-2-2(Create)-1(popup)-t
    @RequestMapping("/class/test/exbank")
    public void selectedExBank(String userId){
        // 강사가 문제은행에서 선택한 문제 번호들을 리턴하는 메서드
        // 어디로 리턴(?)
    }

    // #3-2-2(Create)-1(popup)-1(create)-t
    @RequestMapping("/class/test/exbank/write")
    public void createExBank(String userId){
        // 문제은행에 새로운 문제를 출제하는 메서드
    }

    // 3-2-1(read)-1(submit)-s
    @RequestMapping("/class/test?testno={testno}/apply")
    public void applyTest(String userId, int testId){
        // 실제 학생이 시험보는 페이지
        // >> 동작 페이지??
    }

    // 3-2-1(read)-1(submit)-s
    @RequestMapping("/class/test?testno={testno}/apply")
    public void submitTest(String userId, int testId){
        // 시험 다 푼 다음 제출버튼 누르는 순간 동작하는 메서드(?)
    }

    // 3-2-1(read)-1(submit)-s
    @RequestMapping("/class/test?testno={testno}/apply")
    public void reviewTest(String userId, int testId){
        // 제출한 시험(종료되기 전) 본인이 제출한 내용 다시 확인하는 페이지
    }






    // #3-2-1(Read)-st
    @RequestMapping("/class/test?testId={testId}")
    public void readNowTest(String userId, int testId){
        // 현재 진행중인 시험 상세 페이지 표시
        // 유저가 학생이냐 강사냐에 따라 수정/삭제버튼 표시
    }

    @RequestMapping("/class/test?testId={testId}/edit")
    public void editNowTest(String userId, int testId){
        // 현재 진행중인 시험 상세 페이지 수정(강사ONLY)
    }

    @RequestMapping("/class/test?testId={testId}")
    public void deleteNowTest(String userId, int testId){
        // 현재 진행중인 시험 상세 페이지 삭제(강사ONLY)
    }

//    public void nowToEnded(){
//        // 종료기한이 지난 시험들을 끝난시험으로 옮기는 기능
//    }





    @RequestMapping("/study/endedtest")
    public void showEndedTestList(String userId, Date nowTime){
        // 종료된 시험 목록 표시
        // 종료시간이 현재시간 이전인지(=이미 끝났는지)
    }

    @RequestMapping("/study/endedtest?testId={testId}")
    public void readEndedTest(String userId, int testId){
        // 종료된 시험 상세 페이지 표시
    }

    @RequestMapping("/study/endedtest?testId={testId}/edit")
    public void editEndedTest(String userId, int testId){
        // 종료된 시험 상세 페이지 수정(강사ONLY)
        // 종료된 시험도 수정이 가능해야 하는가?

    }

    @RequestMapping("/study/endedtest?testId={testId}")
    public void deleteEndedTest(String userId, int testId){
        // 종료된 시험 상세 페이지 삭제(강사ONLY)
        // 종료된 시험도 삭제가 가능해야 하는가?

    }

    @RequestMapping("/study/endedtest?testId={testId}&studentid={studentid}")
    public void readEndedTestResult(String userId, int testId){
        // 지난시험에서 학생이 제출한 답변/성적 보는 페이지
        // 강사도 채점/수정/댓글 등의 기능없이 학생과 100% 동일한 화면(시스템 자동채점이라)

    }



}
