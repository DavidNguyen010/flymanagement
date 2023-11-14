package com.flymanager.model;

public class Customer extends Person{
    String identityNumber;
    String userName;
    String password;

    public Customer(String id, String name, String address, String phoneNumber, String identityNumber, String username, String password) {
        super(id, name, address, phoneNumber);
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.identityNumber = identityNumber;
        this.userName = username;
        this.password = password;
    }


    public Customer(){}

    public Customer(String userName,String password){
        this.userName = userName;
        this.password = password;
    }


    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
    @Override
    public String toString() {
        return
                "identityNumber : " + identityNumber + "\t" +
                "Ten : " + name + "\t" +
                "Id : " + id + "\t" +
                "address: " + address + "\t" +
                "phoneNumber:  " + phoneNumber + "\t"
                ;
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
