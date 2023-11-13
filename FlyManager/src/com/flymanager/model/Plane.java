package com.flymanager.model;

public class Plane {
    String id;
    String name;
    String manufacturer;
    String size;
    int seats;

    public Plane() {
    }

    public Plane(String id, String name, String manufacturer, String size, int seats) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.size = size;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return
                "id: " + id + "\t" +
                "Ten may bay: " + name + "\t" +
                "manufacturer: " + manufacturer + "\t" +
                "size: " + size + "\t" +
                "seats: " + seats
                ;
    }
}
