package com.example.oop_project.Madhu.User_1;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Dashboard implements Serializable {
    public String flightId;
    public LocalDate flightDate;
    public String helicopterId;
    public String flightRoute;
    public String departureTime;

    public Dashboard(String flightId, LocalDate flightDate, String helicopterId, String flightRoute, String departureTime) {
        this.flightId = flightId;
        this.flightDate = flightDate;
        this.helicopterId = helicopterId;
        this.flightRoute = flightRoute;
        this.departureTime = departureTime;
    }

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

    @Override
    public String toString() {
        return "Dashboard{" +
                "flightId='" + flightId + '\'' +
                ", flightDate=" + flightDate +
                ", helicopterId='" + helicopterId + '\'' +
                ", flightRoute='" + flightRoute + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}