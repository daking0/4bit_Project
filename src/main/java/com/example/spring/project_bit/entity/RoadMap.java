package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="roadMap")
public class RoadMap implements Serializable {

    @Id
    @Column(name = "roadmap_stage_no")
    private int roadmapStageNo;

    @Column(name = "roadmap_subject")
    private String roadmapSubject;

    @Column(name = "roadmap_chapter")
    private String roadmapChapter;


}
