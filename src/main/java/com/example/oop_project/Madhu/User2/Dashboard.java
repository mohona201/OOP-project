package com.example.oop_project.Madhu.User2;

public class Dashboard {
    public String serviceId;
    public String serviceName;
    public String helicopterType;
    public Integer capacity;
    public Integer flightPrice;
    public String flightAvailability;

    public Dashboard(String serviceId, String serviceName, String helicopterType, Integer capacity, Integer flightPrice, String flightAvailability) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.helicopterType = helicopterType;
        this.capacity = capacity;
        this.flightPrice = flightPrice;
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

    public Integer getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(Integer flightPrice) {
        this.flightPrice = flightPrice;
    }

    public String getFlightAvailability() {
        return flightAvailability;
    }

    public void setFlightAvailability(String flightAvailability) {
        this.flightAvailability = flightAvailability;
    }

    @Override
    public String toString() {
        return "DashboardModel{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", helicopterType='" + helicopterType + '\'' +
                ", capacity=" + capacity +
                ", flightPrice=" + flightPrice +
                ", flightAvailability='" + flightAvailability + '\'' +
                '}';
    }
}
