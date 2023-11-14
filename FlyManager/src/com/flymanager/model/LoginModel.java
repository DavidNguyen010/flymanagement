package com.flymanager.model;

public class LoginModel {
    String userName;
    String password;

    public LoginModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public LoginModel(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
