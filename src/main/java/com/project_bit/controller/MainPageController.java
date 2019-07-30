package com.project_bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/mypage")
public class MainPageController {

    @RequestMapping(path = "/attend")
    public void myAttend(){
        //출결확인
    }

    @RequestMapping(path = "/myinfo")
    public void myInfo(){
        //내정보 보기
    }

    @RequestMapping(path = "/myinfo/edit")
    public void myInfoEdit(){
        //내정보 수정
    }


    @RequestMapping(path = "/mypoint")
    public void mainMyPage(){
        //포인트 확인
    }

}
