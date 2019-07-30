package com.example.spring.project_bit.controller;


import com.example.spring.project_bit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study")
public class StudyController {

    @RequestMapping("/roadmap")
    public void roodMap(String id){
        // 로드맵 리스트
    }

    @RequestMapping("studyentstatus")
    public void studentStatus(){
        // 학생 현황 >> 강사만
    }

}