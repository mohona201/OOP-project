package com.example.oop_project.Erin.models;
import java.io.Serializable;

public class FuelLog implements Serializable {
    private static final long serialVersionUID = 1L;
    private String helicopterId;
    private double litersAdded;
    private String timestamp;

    public FuelLog(String helicopterId, double litersAdded, String timestamp) {
        this.helicopterId = helicopterId;
        this.litersAdded = litersAdded;
        this.timestamp = timestamp;
    }

    public String getHelicopterId() { return helicopterId; }
    public double getLitersAdded() { return litersAdded; }
    public String getTimestamp() { return timestamp; }
}