package com.flymanager.model;

public class Ticket {
    String id;
    String flyCode;
    String type;
    double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlyCode() {
        return flyCode;
    }

    public void setFlyCode(String flyCode) {
        this.flyCode = flyCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ticket() {
    }

    public Ticket(String id, String flyCode, String type, double price) {
        this.id = id;
        this.flyCode = flyCode;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id: " + id + "\t" +
                "flyCode: " + flyCode + "\t" +
                "type: " + type + "\t" +
                "price: " + price ;
    }
}
