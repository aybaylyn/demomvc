package com.may.domain;

import com.may.domain.base.BaseDomain;

/**
 * Created by May on 3/16/17.
 */
public class Authority extends BaseDomain {

    private String authorityName;
    private String description;

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
