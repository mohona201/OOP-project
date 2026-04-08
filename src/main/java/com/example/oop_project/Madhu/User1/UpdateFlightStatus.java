package com.example.oop_project.Madhu.User1;

public class UpdateFlightStatus {
    public String flightId;
    public String updateDate;
    public String updateRoute;
    public String currentStatus;

    public UpdateFlightStatus(String flightId, String updateDate, String updateRoute, String currentStatus) {
        this.flightId = flightId;
        this.updateDate = updateDate;
        this.updateRoute = updateRoute;
        this.currentStatus = currentStatus;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateRoute() {
        return updateRoute;
    }

    public void setUpdateRoute(String updateRoute) {
        this.updateRoute = updateRoute;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "UpdateFlightStatusModel{" +
                "flightId='" + flightId + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", updateRoute='" + updateRoute + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }
}
