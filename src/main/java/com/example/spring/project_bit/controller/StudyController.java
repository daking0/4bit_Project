package com.example.spring.project_bit.controller;


import com.example.spring.project_bit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study")
public class StudyController {

    @RequestMapping("/roadmap")
    public void showRoadMapList(int userId){
        // 로드맵 리스트 보여주는 메서드
    }

    public boolean isRoadmapUnlocked(int roadmapLast){

        }



    }












    @RequestMapping("studyentstatus")
    public void studentStatus(){
        // 학생 현황 >> 강사만
    }

}