package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    @Id
    @Column(name = "article_id")
    private int articleId;

    @Column(name = "article_number")
    private int articleNumber;

    @Column(name = "article_create_date")
    private Date articleCreateDate;

    @Column(name = "article_update_date")
    private Date articleUpdateDate;

    @Column(name = "article_hits")
    private int articleHits;

    @Column(name = "article_like")
    private int articleLike;

    @Column(name = "group_id")
    private int groupId;

    @Column(name = "depth")
    private int depth;

    @Column(name = "sequence")
    private int sequence;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_type")
    private String articleType;

    @Column(name = "article_contents")
    private String articleContents;     //Text 타입

    @Column(name = "isfile")
    private int isfile;

    @Column(name = "user_id")       // fk(User)
    private int userId;

    @Column(name = "board_id")      //fk(board_Manager)
    private String boardId;



}
