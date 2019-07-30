package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="roadmap_exercise")
public class RoadMap_Exercise implements Serializable {

    @Id
    @Column(name = "exercise_sequence")
    private int exerciseSequence;

    @Column(name = "exercise_content")
    private String exerciseContent;

    @Column(name = "exercise_answer")
    private int exerciseAnswer;

    @Column(name = "roadmap_stage_no")      // roadmap fk
    private int roadmapStageNo;


}
