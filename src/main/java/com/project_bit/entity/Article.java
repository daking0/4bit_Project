package com.project_bit.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Article")
public class Article implements Serializable {

    @Id
    @Column(name = "article_UUID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long articleUUID;

    @Column(name = "article_number")
    private int articleNumber;

    @Column(name = "article_create_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date articleCreateDate;

    @Column(name = "article_update_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date articleUpdateDate;

    @Column(name = "article_hits")
    private int articleHits;

    @Column(name = "article_like")
    private int articleLike;

    @Column(name = "group_id")
    private Long groupId;

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

    @Column(name = "isFile")
    private int isFile;

    @Column(name = "user_UUID")
    private Long userUUID;

    @Column(name = "board_UUID")
    private Long boardUUID;

    public Long getArticleUUID() {
        return articleUUID;
    }

    public void setArticleUUID(Long articleUUID) {
        this.articleUUID = articleUUID;
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

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
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

    public int getIsFile() {
        return isFile;
    }

    public void setIsFile(int isFile) {
        this.isFile = isFile;
    }

    public Long getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(Long userUUID) {
        this.userUUID = userUUID;
    }

    public Long getBoardUUID() {
        return boardUUID;
    }

    public void setBoardUUID(Long boardUUID) {
        this.boardUUID = boardUUID;
    }
}
