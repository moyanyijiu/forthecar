package com.xa.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int uid;
    private String uname;
    private String upass;
    private String email;
    private String place;
    private String tel;
    private String qq;
    private String year;
    private String month;
    private String day;
    private String career;
    private String ry1;
    private String ry2;
    private String ry3;
}
