package com.example.oop_project.Madhu.User_2;

import java.io.Serializable;
import java.time.LocalDate;

public class UserBooking implements Serializable {
    public String bookingId;
    public String flightId;
    public String route;
    public String status;
    public String departure;
    public String destination;
    public Integer passengers;
    public Integer amount;

    public UserBooking(String bookingId, String flightId, String route, String status, String departure, String destination, Integer passengers, Integer amount) {
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.route = route;
        this.status = status;
        this.departure = departure;
        this.destination = destination;
        this.passengers = passengers;
        this.amount = amount;
    }

    public String getBookingId() {
        return bookingId;
    }
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getFlightId() {
        return flightId;
    }
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
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

    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "UserBooking{" +
                "bookingId='" + bookingId + '\'' +
                ", flightId='" + flightId + '\'' +
                ", route='" + route + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }
}
