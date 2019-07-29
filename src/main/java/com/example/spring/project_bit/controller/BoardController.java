package com.example.spring.project_bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {

//    @RequestMapping("?id={id}")
    public void showList(String boardId){
        // 해당 id를 가진 board의 글들을 리스트로 보여줌
    }

    @RequestMapping(path = "/write")
    public void writeArticle(String boardId, @RequestParam(name= "classId", required = false) int classId){
        //글 쓰기
    }

    @RequestMapping(path = "/edit")
    public void editArticle(String boardId, @RequestParam(name= "classId", required = false) int classId, String articleNumber){
        //글 수정
    }
    
}
