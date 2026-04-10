package com.example.oop_project.Madhu.User_2;

public class HelicopterService {
    public String serviceId;
    public String serviceName;
    public String helicopterType;
    public Integer capacity;
    public Integer servicePrice;
    public String flightAvailability;

    public HelicopterService(String serviceId, String serviceName, String helicopterType, Integer capacity, Integer servicePrice, String flightAvailability) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.helicopterType = helicopterType;
        this.capacity = capacity;
        this.servicePrice = servicePrice;
        this.flightAvailability = flightAvailability;
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

    public String getFlightAvailability() {
        return flightAvailability;
    }

    public void setFlightAvailability(String flightAvailability) {
        this.flightAvailability = flightAvailability;
    }

    @Override
    public String toString() {
        return "HelicopterServiceModel{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", helicopterType='" + helicopterType + '\'' +
                ", capacity=" + capacity +
                ", servicePrice=" + servicePrice +
                ", flightAvailability='" + flightAvailability + '\'' +
                '}';
    }
}
