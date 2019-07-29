package com.example.spring.project_bit.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "HW_Reply")
public class HW_Reply implements Serializable {

    @Id
    @Column(name = "HW_reply_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long hwReplyUUID;

    @Column(name = "HW_reply_writer")
    private String hwReplyWriter;

    @Column(name = "HW_reply_contents")
    private String hwReplyContents;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HW_reply_create_date")
    private Date hwReplyCreateDate;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HW_reply_update_date")
    private Date hwReplyUpdateDate;

    @Column(name = "HW_article_UUID")
    private Long hwArticleUUID;

    public Long getHwReplyUUID() {
        return hwReplyUUID;
    }

    public void setHwReplyUUID(Long hwReplyUUID) {
        this.hwReplyUUID = hwReplyUUID;
    }

    public String getHwReplyWriter() {
        return hwReplyWriter;
    }

    public void setHwReplyWriter(String hwReplyWriter) {
        this.hwReplyWriter = hwReplyWriter;
    }

    public String getHwReplyContents() {
        return hwReplyContents;
    }

    public void setHwReplyContents(String hwReplyContents) {
        this.hwReplyContents = hwReplyContents;
    }

    public Date getHwReplyCreateDate() {
        return hwReplyCreateDate;
    }

    public void setHwReplyCreateDate(Date hwReplyCreateDate) {
        this.hwReplyCreateDate = hwReplyCreateDate;
    }

    public Date getHwReplyUpdateDate() {
        return hwReplyUpdateDate;
    }

    public void setHwReplyUpdateDate(Date hwReplyUpdateDate) {
        this.hwReplyUpdateDate = hwReplyUpdateDate;
    }

    public Long getHwArticleUUID() {
        return hwArticleUUID;
    }

    public void setHwArticleUUID(Long hwArticleUUID) {
        this.hwArticleUUID = hwArticleUUID;
    }
}
