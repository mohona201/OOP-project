package com.example.oop_project.Madhu.User1;

public class FlightHistoryModel {
    public String flightId;
    public String flightRoute;
    public String hours;
    public String flightStatus;
    public String notes;

    public FlightHistoryModel(String flightId, String flightRoute, String hours, String flightStatus, String notes) {
        this.flightId = flightId;
        this.flightRoute = flightRoute;
        this.hours = hours;
        this.flightStatus = flightStatus;
        this.notes = notes;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "FlightHistoryModel{" +
                "flightId='" + flightId + '\'' +
                ", flightRoute='" + flightRoute + '\'' +
                ", hours='" + hours + '\'' +
                ", flightStatus='" + flightStatus + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
