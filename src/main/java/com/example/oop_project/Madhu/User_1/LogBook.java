package com.example.oop_project.Madhu.User_1;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class LogBook implements Serializable {
    public String flightId;
    public LocalDate flightDate;
    public String flightRoute;
    public String flightStatus;
    public String hours;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public LogBook(String flightId, LocalDate flightDate, String flightRoute, String flightStatus, String hours) {
        this.flightId = flightId;
        this.flightDate = flightDate;
        this.flightRoute = flightRoute;
        this.flightStatus = flightStatus;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "LogFlightHourModel{" +
                "flightId='" + flightId + '\'' +
                ", flightDate=" + flightDate +
                ", flightRoute='" + flightRoute + '\'' +
                ", flightStatus='" + flightStatus + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }
}
