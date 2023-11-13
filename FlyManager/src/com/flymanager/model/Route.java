package com.flymanager.model;

public class Route {
    String id;
    String location;
    double width;
    double height;
    String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Route(String id, String location, double width, double height, String status) {
        this.id = id;
        this.location = location;
        this.width = width;
        this.height = height;
        this.status = status;
    }

    public Route(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "id: " + id + "\t" +
                "location: " + location + "\t" +
                "chieu rong may bay: " + width +"\t"+
                "Chieu dai may bay: " + height + "\t"+
                "status: " + status + "\t"
                ;
    }
}
