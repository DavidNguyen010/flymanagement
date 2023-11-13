package com.flymanager.model;

public class Staff extends Person {
    String position;

    public Staff(String id, String name, String address, String phoneNumber, String position) {
        super(id, name, address, phoneNumber);
        this.position = position;
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
}
