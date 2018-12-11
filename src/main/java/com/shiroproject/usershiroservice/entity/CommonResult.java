package com.shiroproject.usershiroservice.entity;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommonResult implements Serializable{
    //返回代码
    private int code;
    //返回错误信息
    private String message;
    private Object T;
    private List LT;
    private Map MT;

    public Object getT() {
        return T;
    }

    public void setT(Object t) {
        T = t;
    }

    public int getCode() {
        return code;
    }

    public List getLT() {
        return LT;
    }

    public void setLT(List LT) {
        this.LT = LT;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void setT(Entity t) {
        T = t;
    }



    public Map getMT() {
        return MT;
    }

    public void setMT(Map MT) {
        this.MT = MT;
    }
}
