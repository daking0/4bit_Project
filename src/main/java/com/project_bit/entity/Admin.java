package com.project_bit.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="Admin")
public class Admin implements Serializable {

    @Id
    @Column(name="admin_UUID", updatable = false, nullable = false)
    private UUID adminId;

    @Column(name = "branch_code")
    private String branchCode;

    @Column(name = "user_UUID")
    @JoinColumn(name = "user_UUID", referencedColumnName = "user_UUID")
    private String userId;

    public UUID getAdminId() {
        return adminId;
    }

    public void setAdminId(UUID adminId) {
        this.adminId = adminId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
