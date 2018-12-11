package com.shiroproject.usershiroservice.entity;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Integer identityid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIdentityid() {
        return identityid;
    }

    public void setIdentityid(Integer identityid) {
        this.identityid = identityid;
    }
}