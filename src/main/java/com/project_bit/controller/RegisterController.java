package com.project_bit.controller;

import com.project_bit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/manage")
public class RegisterController {


    @RequestMapping(path = "/member/new")
    public User memberRegister(){
        //회원 등록
        return null;
    }

    @RequestMapping(path = "/class/new")
    public User classRegister(){
        //클래스 등록
        return null;
    }


}
