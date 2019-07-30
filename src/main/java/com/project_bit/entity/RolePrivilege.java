package com.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Role_Privilege")
public class RolePrivilege implements Serializable {

    @Column(name = "role_code")
    @JoinColumn(name = "role_code", referencedColumnName = "role_code")
    private String roleCode;

    @Column(name = "privilege_code")
    @JoinColumn(name = "privilege_code", referencedColumnName = "privilege_code")
    private String privilegeCode;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getPrivilegeCode() {
        return privilegeCode;
    }

    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode;
    }

}
