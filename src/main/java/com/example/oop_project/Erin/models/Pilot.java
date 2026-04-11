package com.example.oop_project.Erin.models;
import java.io.Serializable;

public class Pilot implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures file compatibility
    private String name, licenseId, shift;

    public Pilot(String name, String licenseId, String shift) {
        this.name = name;
        this.licenseId = licenseId;
        this.shift = shift;
    }

    // Getters are required for TableView to display data
    public String getName() { return name; }
    public String getLicenseId() { return licenseId; }
    public String getShift() { return shift; }
}