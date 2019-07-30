package com.project_bit.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Hw_article implements Serializable {

    @Column(name = "HW_article_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long hwArticleUUID;

    @Column(name = "HW_submit_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date hwSubmitDate;

    @Column(name = "HW_update_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date hwUpdateDate;

    @Column(name = "HW_contents")
    private String hwContents;

    @Column(name = "HW_isFile")
    private int hwIsFile;

    @Column(name = "HW_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long hwUUID;

    @Column(name = "student_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long studentUUID;
}
