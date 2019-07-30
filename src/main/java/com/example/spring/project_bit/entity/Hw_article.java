package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="hw_article")
public class HW_Article implements Serializable {

    @Id
    @Column(name = "hw_article_id")
    private int hwArticleId;

    @Column(name = "hw_submit_date")
    private Date hwSubmitDate;

    @Column(name = "hw_update_date")
    private Date hwUpdateDate;

    @Column(name = "hw_contents")
    private String hwContents;

    @Column(name = "hw_isfile")
    private int hwIsFile;

    @Column(name = "hw_id")     //과제 fk
    private int hwId;

    @Column(name = "student_id")    // student fk
    private int studentId;
}
