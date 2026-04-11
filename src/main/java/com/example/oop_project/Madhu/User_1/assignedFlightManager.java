package com.example.oop_project.Madhu.User_1;

import java.time.LocalDate;

public class assignedFlightManager {
    String flightID;
    String helicopterID;
    LocalDate date;
    String flightRoute;
    String departureTime;

    public assignedFlightManager(String flightID, String helicopterID, LocalDate date, String flightRoute, String departureTime) {
        this.flightID = flightID;
        this.helicopterID = helicopterID;
        this.date = date;
        this.flightRoute = flightRoute;
        this.departureTime = departureTime;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getHelicopterID() {
        return helicopterID;
    }

    public void setHelicopterID(String helicopterID) {
        this.helicopterID = helicopterID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
        return "assignedFlightManager{" +
                "flightID='" + flightID + '\'' +
                ", helicopterID='" + helicopterID + '\'' +
                ", date=" + date +
                ", flightRoute='" + flightRoute + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
