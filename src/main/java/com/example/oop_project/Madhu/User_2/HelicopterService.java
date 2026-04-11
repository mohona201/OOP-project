package com.example.oop_project.Madhu.User_2;

import java.io.Serializable;
import java.time.LocalDate;

public class HelicopterService implements Serializable {
    public String flightId;
    public String helicopterId;
    public String helicopterType;
    public LocalDate date;
    public String route;
    public  String time;


    public HelicopterService(String flightId, String helicopterId, String helicopterType, LocalDate date, String route, String time) {
        this.flightId = flightId;
        this.helicopterId = helicopterId;
        this.helicopterType = helicopterType;
        this.date = date;
        this.route = route;
        this.time = time;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public String getHelicopterType() {
        return helicopterType;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getRoute() {
        return route;
    }

    public String getTime() {
        return time;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public void setHelicopterType(String helicopterType) {
        this.helicopterType = helicopterType;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "HelicopterService{" +
                "flightId='" + flightId + '\'' +
                ", helicopterId='" + helicopterId + '\'' +
                ", helicopterType='" + helicopterType + '\'' +
                ", date=" + date +
                ", route='" + route + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
