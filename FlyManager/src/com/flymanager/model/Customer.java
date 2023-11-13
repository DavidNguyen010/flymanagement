package com.flymanager.model;

public class Customer extends Person{
    String identityNumber;

    public Customer(String id, String name, String address, String phoneNumber,String identityNumber) {
        super(id, name, address, phoneNumber);
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.identityNumber = identityNumber;
    }

    public Customer(String id, String name, String address, String phoneNumber) {
        super(id, name, address, phoneNumber);
    }
    public Customer(){}




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
}
