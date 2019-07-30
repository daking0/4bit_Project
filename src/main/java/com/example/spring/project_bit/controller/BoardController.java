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
        // class정보도 받아와야 하나? - 반 게시판은 해당반 글목록만 보여줘야 하니까
    }

    @RequestMapping(path = "/write")
    public void writeArticle(String boardId, @RequestParam(name= "classId", required = false) int classId){
        // 글 쓰기
        // 글쓴이 정보도 받아와야 하나?
    }

    //    @RequestMapping("?id={id}&no={no}")
    public void readArticle(String boardId, @RequestParam(name= "classId", required = false) int classId, String articleNumber){
        // 글 읽기
    }

    @RequestMapping(path = "/edit")
    public void editArticle(String boardId, @RequestParam(name= "classId", required = false) int classId, String articleNumber){
        //글 수정
        // 글쓴이 정보도 받아와야 할듯(본인과 관리자만 수정가능하니까)
    }

    @RequestMapping(path = "/delete")
    public void deleteArticle(String boardId, @RequestParam(name= "classId", required = false) int classId, String articleNumber){
        //글 삭제
        // 글쓴이 정보도 받아와야 할듯(본인과 관리자만 수정가능하니까)
    }


}
