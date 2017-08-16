package com.spring.jdbcTemplate;

import java.sql.Date;

/**
 * Created by Administrator on 2017/8/16 0016.
 */
public class T_User {
    private int id ;
    private String username;
    private String password;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String image;
    private String text;
    private Date date;

    @Override
    public String toString() {
        return "T_User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", image='" + image + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
