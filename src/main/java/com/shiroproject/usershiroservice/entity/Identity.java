package com.shiroproject.usershiroservice.entity;

import java.io.Serializable;

public class Identity implements Serializable {
    private Integer id;

    private String identitiyname;

    private Integer authorityid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentitiyname() {
        return identitiyname;
    }

    public void setIdentitiyname(String identitiyname) {
        this.identitiyname = identitiyname == null ? null : identitiyname.trim();
    }

    public Integer getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(Integer authorityid) {
        this.authorityid = authorityid;
    }
}