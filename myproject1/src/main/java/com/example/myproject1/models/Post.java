package com.example.myproject1.models;

import jakarta.validation.constraints.NotEmpty;

import java.io.Serial;
import java.io.Serializable;

public class Post implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String msg;
    private String status;
    private String image;

    public Post() {

    }

    public Post(String msg, String status) {
        this.msg = msg;
        this.status = status;
    }

    public Post(String msg, String status, String image) {
        this.msg = msg;
        this.status = status;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

