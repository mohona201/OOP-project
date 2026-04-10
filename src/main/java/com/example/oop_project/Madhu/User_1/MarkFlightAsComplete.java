package com.example.oop_project.Madhu.User_1;

import java.time.LocalDate;

public class MarkFlightAsComplete {
    public String flightId;
    public LocalDate flightCompleteDate;
    public String flightStatus;
    public String notes;

    public MarkFlightAsComplete(String flightId, LocalDate flightCompleteDate, String flightstatus, String notes) {
        this.flightId = flightId;
        this.flightCompleteDate = flightCompleteDate;
        this.flightStatus = flightstatus;
        this.notes = notes;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public LocalDate getFlightCompleteDate() {
        return flightCompleteDate;
    }

    public void setFlightCompleteDate(LocalDate flightCompleteDate) {
        this.flightCompleteDate = flightCompleteDate;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "MarkFlightAsCompleteModel{" +
                "flightId='" + flightId + '\'' +
                ", flightCompleteDate=" + flightCompleteDate +
                ", flightStatus='" + flightStatus + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
