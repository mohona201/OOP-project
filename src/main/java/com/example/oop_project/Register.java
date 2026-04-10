package com.example.oop_project;

import java.io.Serializable;

public class Register implements Serializable {
    ;
    public Integer userId;
    public String email;
    public String name;
    public String password;
    public String role;

    public Register(Integer userId, String email, String name, String password, String role) {
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Register{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
