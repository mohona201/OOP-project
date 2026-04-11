package com.example.oop_project.Erin.models;

import java.io.Serializable;

public class Flight implements Serializable {
    private static final long serialVersionUID = 1L;

    private String flightId;
    private String passengerName;
    private String destination;
    private String helicopterId;
    private String status; // "Pending", "Scheduled", "Dispatched", "Completed"

    public Flight(String flightId, String passengerName, String destination, String helicopterId, String status) {
        this.flightId = flightId;
        this.passengerName = passengerName;
        this.destination = destination;
        this.helicopterId = helicopterId;
        this.status = status;
    }

    // Getters
    public String getFlightId() { return flightId; }
    public String getPassengerName() { return passengerName; }
    public String getDestination() { return destination; }
    public String getHelicopterId() { return helicopterId; }
    public String getStatus() { return status; }

    // Setter for Dispatch Officer to update status
    public void setStatus(String status) { this.status = status; }
}