package com.example.oop_project.Madhu.User1;

import java.time.LocalDate;
import java.time.LocalTime;

public class FlightHistory {
    public String flightId;
    public String route;
    public LocalTime hours;
    public String status;
    public String notes;
    public LocalDate date;


    public FlightHistory(String flightId, String route, LocalTime hours, String status, String notes, LocalDate date) {
        this.flightId = flightId;
        this.route = route;
        this.hours = hours;
        this.status = status;
        this.notes = notes;
        this.date = date;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getRoute() {
        return route;
    }

    public LocalTime getHours() {
        return hours;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setHours(LocalTime hours) {
        this.hours = hours;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FlightHistory{" +
                "flightId='" + flightId + '\'' +
                ", route='" + route + '\'' +
                ", hours=" + hours +
                ", status='" + status + '\'' +
                ", notes='" + notes + '\'' +
                ", date=" + date +
                '}';
    }
}
