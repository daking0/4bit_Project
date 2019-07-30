package com.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="Teacher")
public class Teacher implements Serializable {

    @Id
    @Column(name="teacher_UUID", updatable = false, nullable = false)
    private UUID teacherId;

    @Column(name="user_UUID")
    private User userId;

    @Column(name="class_UUID")
    private Class classId;

    public UUID getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(UUID teacherId) {
        this.teacherId = teacherId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Class getClassId() {
        return classId;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }
}
