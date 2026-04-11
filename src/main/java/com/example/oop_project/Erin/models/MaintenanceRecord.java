package com.example.oop_project.Erin.models;
import java.io.Serializable;

public class MaintenanceRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    private String helicopterId;
    private String status;
    private String lastServiceDate;

    public MaintenanceRecord(String helicopterId, String status, String lastServiceDate) {
        this.helicopterId = helicopterId;
        this.status = status;
        this.lastServiceDate = lastServiceDate;
    }

    public String getHelicopterId() { return helicopterId; }
    public String getStatus() { return status; }
    public String getLastServiceDate() { return lastServiceDate; }
}