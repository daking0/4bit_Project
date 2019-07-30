package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "hw_file")
public class HW_File implements Serializable {

    @Id
    @Column(name = "hw_file_id")
    private int hwFileId;

    @Column(name = "hw_file_url")
    private String hwFileUrl;

    @Column(name = "hw_article_id")     //fk(HW_Article table)
    private int hwArticleId;

    @Column(name = "hw_file_name")
    private String hwFileName;

    @Column(name = "hw_file_size")
    private int hwFileSize;
}
