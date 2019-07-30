package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reply")
public class Reply implements Serializable{

    @Id
    @Column(name = "reply_id")
    private int replyId;

    @Column(name = "reply_writer")
    private String replyWriter;

    @Column(name = "reply_contents")
    private String replyContents;

    @Column(name = "reply_create_Date")
    private Date replyCreateDate;

    @Column(name = "reply_update_Date")
    private Date replyUpdateDate;

    @Column(name = "reply_group_id")
    private int replyGroupId;

    @Column(name = "reply_Depth")
    private int replyDepth;

    @Column(name = "reply_sequence")
    private int replySequence;

    @Column(name = "article_id")        //fk(article)
    private int articleId;

}
