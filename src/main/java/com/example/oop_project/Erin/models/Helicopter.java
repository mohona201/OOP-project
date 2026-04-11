package com.example.oop_project.Erin.models;

import java.io.Serializable;

public class Helicopter implements Serializable {
    private String tailNumber; // e.g., H-99
    private String model;      // e.g., Bell 407
    private String status;     // "Ready", "Maintenance Required", "Grounded"
    private int flightHoursSinceService;

    public Helicopter(String tailNumber, String model) {
        this.tailNumber = tailNumber;
        this.model = model;
        this.status = "Ready";
        this.flightHoursSinceService = 0;
    }

    // Getters and Setters
    public String getTailNumber() { return tailNumber; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return tailNumber + " [" + model + "] - Status: " + status;
    }
}