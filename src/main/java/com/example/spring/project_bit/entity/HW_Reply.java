package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "hw_reply")
public class HW_Reply implements Serializable {
//        @Column(name = "user_id")
//        private Long userId;
//
//        @Column(name = "user_ID")
//        private String username;
//
//        @Column(name = "password")

    @Id
    @Column(name = "hw_reply_id")
    private int hwReplyId;

    @Column(name = "hw_reply_writer")
    private String hwReplyWriter;

    @Column(name = "hw_reply_contents")
    private String hwReplyContents;

    @Column(name = "hw_reply_create_date")
    private Date hwReplyCreateDate;

    @Column(name = "hw_reply_update_date")
    private Date hwReplyUpdateDate;

    @Column(name = "hw_article_id")         // fk (HW_Article 테이블)
    private int hwArticleId;

}
