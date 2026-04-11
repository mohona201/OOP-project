package com.example.oop_project.Madhu.User_2;

import java.time.LocalDate;

public class Dashboard {
    public Integer capacity;
    public Integer flightPrice;
    public String flightAvailability;
    public LocalDate date;
    public Integer flightId;


    public Dashboard(Integer capacity, Integer flightPrice, String flightAvailability, LocalDate date, Integer flightId) {
        this.capacity = capacity;
        this.flightPrice = flightPrice;
        this.flightAvailability = flightAvailability;
        this.date = date;
        this.flightId = flightId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getFlightPrice() {
        return flightPrice;
    }

    public String getFlightAvailability() {
        return flightAvailability;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setFlightPrice(Integer flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setFlightAvailability(String flightAvailability) {
        this.flightAvailability = flightAvailability;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "capacity=" + capacity +
                ", flightPrice=" + flightPrice +
                ", flightAvailability='" + flightAvailability + '\'' +
                ", date=" + date +
                ", flightId=" + flightId +
                '}';
    }
}
