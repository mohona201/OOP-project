package com.example.oop_project.Madhu.User1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dashboard {
    public String flightId , route;
    public LocalDate flightDate;
    public String helicopterId;
    public String flightRoute;
    public LocalTime departureTime;
    public String flightStatus;


    public Dashboard(String flightId, String route, LocalDate flightDate, String helicopterId, String flightRoute, LocalTime departureTime, String flightStatus) {
        this.flightId = flightId;
        this.route = route;
        this.flightDate = flightDate;
        this.helicopterId = helicopterId;
        this.flightRoute = flightRoute;
        this.departureTime = departureTime;
        this.flightStatus = flightStatus;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getRoute() {
        return route;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "flightId='" + flightId + '\'' +
                ", route='" + route + '\'' +
                ", flightDate=" + flightDate +
                ", helicopterId='" + helicopterId + '\'' +
                ", flightRoute='" + flightRoute + '\'' +
                ", departureTime=" + departureTime +
                ", flightStatus='" + flightStatus + '\'' +
                '}';
    }
}
