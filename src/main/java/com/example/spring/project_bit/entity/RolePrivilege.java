package com.example.spring.project_bit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "role_privilege")
public class RolePrivilege implements Serializable {

    @Column(name = "role_code")     //role fk
    private String roleCode;

    @Column(name = "privilege_code")    //privilege fk
    private String privilegeCode;

}
