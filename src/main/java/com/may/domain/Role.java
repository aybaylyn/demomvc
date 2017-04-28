package com.may.domain;

import com.may.domain.base.BaseDomain;

/**
 * Created by May on 3/16/17.
 */
public class Role extends BaseDomain {

    private String roleName;
    private String description;


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
