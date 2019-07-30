package com.example.spring.project_bit.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="admin")
public class Admin implements Serializable {

    @Id
    @Column(name="admin_id")
    private int adminId;

    @Column(name = "branch_code")
    private String branchCode;

    @Column(name = "user_id")       //user fk
    private String userId;
}
