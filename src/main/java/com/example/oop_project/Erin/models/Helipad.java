package com.example.oop_project.Erin.models;
import java.io.Serializable;

public class Helipad implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private boolean occupied;

    public Helipad(String name, boolean occupied) {
        this.name = name;
        this.occupied = occupied;
    }

    // Getters - PropertyValueFactory uses these!
    public String getName() { return name; }
    public boolean isOccupied() { return occupied; }

    // Setter for the toggle
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
}