package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "article_file")
public class Article_File implements Serializable {

    @Id
    @Column(name = "file_id")
    private int fileId;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "article_id")
    private int articleId;              //fk(Article)

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_size")
    private int fileSize;
}
