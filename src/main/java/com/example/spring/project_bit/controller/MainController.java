package com.example.spring.project_bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/mypage")
public class MainController {

    @RequestMapping(path = "/attend")
    public void MyAttend(){
        //출결확인
    }

    @RequestMapping(path = "/myinfo")
    public void myInfo(){
        //내정보보기
    }

    @RequestMapping(path = "/myinfo/edit")
    public void myInfoEdit(){
        //출결확인
    }


    @RequestMapping(path = "/mypoint")
    public void mainMyPage(){
        //출결확인
    }

}
