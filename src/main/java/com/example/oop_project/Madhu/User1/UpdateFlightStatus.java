package com.example.oop_project.Madhu.User1;

import java.time.LocalDate;

public class UpdateFlightStatus {
    public String flightId;
    public String updateDate;
    public String updateRoute;
    public String currentStatus;
    public LocalDate date;


    public UpdateFlightStatus(String flightId, String updateDate, String updateRoute, String currentStatus, LocalDate date) {
        this.flightId = flightId;
        this.updateDate = updateDate;
        this.updateRoute = updateRoute;
        this.currentStatus = currentStatus;
        this.date = date;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public String getUpdateRoute() {
        return updateRoute;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public void setUpdateRoute(String updateRoute) {
        this.updateRoute = updateRoute;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UpdateFlightStatus{" +
                "flightId='" + flightId + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", updateRoute='" + updateRoute + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", date=" + date +
                '}';
    }
}
