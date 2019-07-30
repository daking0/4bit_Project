package com.example.spring.project_bit.entity;

<<<<<<< HEAD
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
=======
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
>>>>>>> 23ffd9167c835914bee1fe6c08a28c9b72aa0320
}
