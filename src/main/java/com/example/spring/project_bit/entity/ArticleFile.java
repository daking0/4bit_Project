package com.example.spring.project_bit.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Article_File")
public class ArticleFile {

    @Id
    @Column(name = "file_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long fileUUID;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "article_UUID")
    private Long articleUUID;

    public Long getFileUUID() {
        return fileUUID;
    }

    public void setFileUUID(Long fileUUID) {
        this.fileUUID = fileUUID;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Long getArticleUUID() {
        return articleUUID;
    }

    public void setArticleUUID(Long articleUUID) {
        this.articleUUID = articleUUID;
    }
}

