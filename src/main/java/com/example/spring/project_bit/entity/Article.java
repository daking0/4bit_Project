package com.example.spring.todo.entity;

import com.example.spring.todo.util.BooleanToStringConverter;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "article")
@DynamicInsert
public class Article implements Serializable {

    @Id
    @Column(columnDefinition = "BIGINT", name = "article_id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleId;

    @Column(name = "article_number")
    private int articleNumber;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "article_create_date")
    private Date articleCreateDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "article_update_date")
    private Date articleUpdateDate;

    @Column(name = "article_hits")
    private int articleHits;

    @Column(name = "article_like")
    private int articleLike;

    @Column(name = "group_id")
    private int groupId;

    @Column(name = "depth")
    private int depth;

    @Column(name = "sequence")
    private int sequence;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_type")
    private String articleType;

    @Column(name = "article_contents")
    private String articleContents;

    @Column(name = "isfile")
    @Convert(converter = BooleanToStringConverter.class)
    private Boolean isfile;

//    @OneToOne
//    @JoinColumn(name = "board_id")
//    private Board_Manager board_manager;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;


    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Date getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(Date articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public Date getArticleUpdateDate() {
        return articleUpdateDate;
    }

    public void setArticleUpdateDate(Date articleUpdateDate) {
        this.articleUpdateDate = articleUpdateDate;
    }

    public int getArticleHits() {
        return articleHits;
    }

    public void setArticleHits(int articleHits) {
        this.articleHits = articleHits;
    }

    public int getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(int articleLike) {
        this.articleLike = articleLike;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getArticleContents() {
        return articleContents;
    }

    public void setArticleContents(String articleContents) {
        this.articleContents = articleContents;
    }

    public Boolean getIsfile() {
        return isfile;
    }

    public void setIsfile(Boolean isfile) {
        this.isfile = isfile;
    }

//    public Board_Manager getBoard_manager() {
//        return board_manager;
//    }
//
//    public void setBoard_manager(Board_Manager board_manager) {
//        this.board_manager = board_manager;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
