package com.example.spring.project_bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {

//    @RequestMapping("?id={id}")
    public void showArticleList(String boardId){
        // 해당 id를 가진 board의 글들을 리스트로 보여줌
        // class정보도 받아와야 하나? - 반 게시판은 해당반 글목록만 보여줘야 하니까
    }

    @RequestMapping(path = "/write")
    public void writeArticle(String boardId, int userId, @RequestParam(name= "classId", required = false) int classId){
        // 글 쓰기
        // 글쓴이 정보도 받아와야 하나?
    }

    //    @RequestMapping("?id={id}&no={no}")
    public void readArticle(String boardId, int userId, @RequestParam(name= "classId", required = false) int classId, int articleNumber){
        // 글 읽기
    }

    @RequestMapping(path = "/edit")
    public void editArticle(String boardId, int userId, @RequestParam(name= "classId", required = false) int classId, int articleNumber){
        //글 수정
        // 글쓴이 정보도 받아와야 할듯(본인과 관리자만 수정가능하니까)
    }

    @RequestMapping(path = "/delete")
    public void deleteArticle(String boardId, int userId, @RequestParam(name= "classId", required = false) int classId, int articleNumber){
        //글 삭제
        // 글쓴이 정보도 받아와야 할듯(본인과 관리자만 수정가능하니까)
    }

    public void showReplyList(String boardId, int userId, int articleNumber){
        // 해당 게시글의 댓글 목록을 보여줌

    }

    public void writeReply(String boardId, int userId, int articleNumber,
                           @RequestParam(name= "refReplyId", required = false) int refReplyId,
                           @RequestParam(name= "refReplyDepth", required = false) int refReplyDepth,
                           @RequestParam(name= "refReplySequence", required = false) int refReplySequence,
                           @RequestParam(name= "refReplyGroupId", required = false) int refReplyGroupId){
        // 댓글 달기
        // 대댓글인 경우에는 부모댓글의 id, depth, sequence, groupId등이 필요

    }

    public void deleteReply(String boardId, int userId, int articleNumber){
        // 댓글 삭제
        // (대댓글이 있는 경우), 실제 댓글이 삭제되지 않고 "삭제된 댓글입니다"라고 내용을 수정만한다
    }


}
