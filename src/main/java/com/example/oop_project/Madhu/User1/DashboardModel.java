package com.example.oop_project.Madhu.User1;

import java.time.LocalDate;

public class DashboardModel {
    public String flightId;
    public LocalDate flightDate;
    public String helicopterId;
    public String flightRoute;
    public String departureTime;
    public String flightStatus;

    public DashboardModel(LocalDate flightDate, String helicopterId, String flightRoute, String departureTime, String flightStatus, String flightId) {
        this.flightDate = flightDate;
        this.helicopterId = helicopterId;
        this.flightRoute = flightRoute;
        this.departureTime = departureTime;
        this.flightStatus = flightStatus;
        this.flightId = flightId;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "DashboardModel{" +
                "flightId='" + flightId + '\'' +
                ", flightDate=" + flightDate +
                ", helicopterId='" + helicopterId + '\'' +
                ", flightRoute='" + flightRoute + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", flightStatus='" + flightStatus + '\'' +
                '}';
    }
}
