package com.example.spring.project_bit.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

public class HW_File implements Serializable {

    @Column(name = "HW_file_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long hwFileUUID;

    @Column(name = "HW_file_url")
    private String hwFileURL;

    @Column(name = "HW_article_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long hwArticleUUID;
}
