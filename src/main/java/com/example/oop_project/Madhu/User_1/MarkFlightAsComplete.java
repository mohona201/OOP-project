package com.example.oop_project.Madhu.User_1;

import java.io.Serializable;
import java.time.LocalDate;

public class MarkFlightAsComplete implements Serializable {
    public String flightId,helicopterId;
    public LocalDate flightCompleteDate;
    public String route;

    public MarkFlightAsComplete(String flightId, String helicopterId, LocalDate flightCompleteDate, String route) {
        this.flightId = flightId;
        this.helicopterId = helicopterId;
        this.flightCompleteDate = flightCompleteDate;
        this.route = route;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public LocalDate getFlightCompleteDate() {
        return flightCompleteDate;
    }

    public String getRoute() {
        return route;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public void setFlightCompleteDate(LocalDate flightCompleteDate) {
        this.flightCompleteDate = flightCompleteDate;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "MarkFlightAsComplete{" +
                "flightId='" + flightId + '\'' +
                ", helicopterId='" + helicopterId + '\'' +
                ", flightCompleteDate=" + flightCompleteDate +
                ", route='" + route + '\'' +
                '}';
    }
}
