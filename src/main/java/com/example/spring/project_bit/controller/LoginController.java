package com.example.spring.project_bit.controller;

import com.example.spring.project_bit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/")
    public User login(){
        // 로그인 처리
        return null;
    }

    @RequestMapping(path = "/id")
    public User findId(String email){
        //아이디 찾기
        return null;
    }

    @RequestMapping(path = "/id/check")
    public User idCheck(){
        //찾은 ID 화면에 표시
        return null;
    }
    
    @RequestMapping(path = "/pw/check")
    public User findPw(){
        //비밀번호 찾기
        return null;
    }

    @RequestMapping(path = "/pw/check")
    public User pwCheck(){
        //패스워드 리셋 링크 메일로 보냈다고 화면에 표시
        return null;
    }
}
