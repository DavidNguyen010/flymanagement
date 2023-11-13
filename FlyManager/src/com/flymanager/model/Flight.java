package com.flymanager.model;

public class Flight extends Route {
    String id;
//    String maduongbay;
    String mamaybay;
    String dateArrives;
    String dateDepartment;
    String note;
    String flightTime;
    public Flight(String id, String flightTime, String dateArrives,
                  String dateDepartment, String note, String location,
                  double v, double parseDouble, String status){
        super(id);
        this.id = getId();
    }

    public Flight(String id, String location, double width,
                  double height, String status, String id1,
                  String mamaybay, String dateArrives, String dateDepartment,
                  String note, String flightTime) {
        super(id, location, width, height, status);
        this.id = id1;
        this.mamaybay = mamaybay;
        this.dateArrives = dateArrives;
        this.dateDepartment = dateDepartment;
        this.note = note;
        this.flightTime = flightTime;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getMamaybay() {
        return mamaybay;
    }

    public void setMamaybay(String mamaybay) {
        this.mamaybay = mamaybay;
    }

    public String getDateArrives() {
        return dateArrives;
    }

    public void setDateArrives(String dateArrives) {
        this.dateArrives = dateArrives;
    }

    public String getDateDepartment() {
        return dateDepartment;
    }

    public void setDateDepartment(String dateDepartment) {
        this.dateDepartment = dateDepartment;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public String toString() {
        return
                "id: " + id + "\t" +
                "mamaybay: " + mamaybay + "\t" +
                "dateArrives: " + dateArrives + "\t" +
                "dateDepartment: " + dateDepartment + "\t" +
                "note: " + note + "\t" +
                "flightTime: " + flightTime + "\t" +
                "location: " + location + "\t" +
                "width: " + width + "\t"+
                "height: " + height + "\t"+
                "status: " + status + "\t"
                ;
    }
}
