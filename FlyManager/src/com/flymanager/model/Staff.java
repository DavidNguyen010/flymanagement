package com.flymanager.model;

public class Staff extends Person {
    String position;
    String userName;
    String password;

    public Staff(String id, String name, String address, String phoneNumber, String position) {
        super(id, name, address, phoneNumber);
        this.position = position;
    }

    public Staff(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public Staff(String position) {
        this.position = position;
    }

    public Staff() {
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id +"\t" +
                "Name: " + name + "\t"+
                "Dia chi: " + address +"\t"+
                "Phone number: " + phoneNumber+"\t"+
                "Vi tri lam viec: " + position;
    }

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
