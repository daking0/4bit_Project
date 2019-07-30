package com.project_bit.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reply")
public class Reply {

    @Id
    @Column(name = "reply_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long replyUUID;

    @Column(name = "reply_writer")
    private String replyWriter;

    @Column(name = "reply_contents")
    private String replyContents;

    @Column(name = "reply_create_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date replyCreateDate;

    @Column(name = "reply_update_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date replyUpdateDate;

    @Column(name = "reply_group_id")
    private Long replyGroupId;

    @Column(name = "reply_depth")
    private int replyDepth;

    @Column(name = "reply_sequence")
    private int replySequence;

    @Column(name = "articleUUID")
    private Long article_UUID;


    public Long getReplyUUID() {
        return replyUUID;
    }

    public void setReplyUUID(Long replyUUID) {
        this.replyUUID = replyUUID;
    }

    public String getReplyWriter() {
        return replyWriter;
    }

    public void setReplyWriter(String replyWriter) {
        this.replyWriter = replyWriter;
    }

    public String getReplyContents() {
        return replyContents;
    }

    public void setReplyContents(String replyContents) {
        this.replyContents = replyContents;
    }

    public Date getReplyCreateDate() {
        return replyCreateDate;
    }

    public void setReplyCreateDate(Date replyCreateDate) {
        this.replyCreateDate = replyCreateDate;
    }

    public Date getReplyUpdateDate() {
        return replyUpdateDate;
    }

    public void setReplyUpdateDate(Date replyUpdateDate) {
        this.replyUpdateDate = replyUpdateDate;
    }

    public Long getReplyGroupId() {
        return replyGroupId;
    }

    public void setReplyGroupId(Long replyGroupId) {
        this.replyGroupId = replyGroupId;
    }

    public int getReplyDepth() {
        return replyDepth;
    }

    public void setReplyDepth(int replyDepth) {
        this.replyDepth = replyDepth;
    }

    public int getReplySequence() {
        return replySequence;
    }

    public void setReplySequence(int replySequence) {
        this.replySequence = replySequence;
    }

    public Long getArticle_UUID() {
        return article_UUID;
    }

    public void setArticle_UUID(Long article_UUID) {
        this.article_UUID = article_UUID;
    }
}
