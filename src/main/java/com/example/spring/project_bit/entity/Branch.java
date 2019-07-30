package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="branch")
public class Branch implements Serializable {

    @Id
    @Column(name = "branch_code", nullable = false, updatable = false)
    private String branchCode;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "branch_phone")
    private String branchPhone;

}
