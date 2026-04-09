package com.example.oop_project.Madhu.User2;

import java.time.LocalDate;

public class BookHelicopter {
    public String serviceId;
    public String serviceName;
    public String helicopterType;
    public Integer capacity;
    public Integer servicePrice;
    public LocalDate flightDate;
    public String departure;
    public String destination;
    public Integer passengers;

    public BookHelicopter(String serviceId, String serviceName, String helicopterType, Integer capacity, Integer servicePrice, LocalDate flightDate, String departure, String destination, Integer passengers) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.helicopterType = helicopterType;
        this.capacity = capacity;
        this.servicePrice = servicePrice;
        this.flightDate = flightDate;
        this.departure = departure;
        this.destination = destination;
        this.passengers = passengers;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getHelicopterType() {
        return helicopterType;
    }

    public void setHelicopterType(String helicopterType) {
        this.helicopterType = helicopterType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Integer servicePrice) {
        this.servicePrice = servicePrice;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "BookHelicopterModel{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", helicopterType='" + helicopterType + '\'' +
                ", capacity=" + capacity +
                ", servicePrice=" + servicePrice +
                ", flightDate=" + flightDate +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
