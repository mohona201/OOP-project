package com.example.oop_project.Madhu.User2;

import java.time.LocalDate;

public class BookingStatusModel {
    public String bookingId;
    public String serviceName;
    public LocalDate bookingDate;
    public String flightRoute;
    public String bookingStatus;

    public BookingStatusModel(String bookingId, String serviceName, LocalDate bookingDate, String flightRoute, String bookingStatus) {
        this.bookingId = bookingId;
        this.serviceName = serviceName;
        this.bookingDate = bookingDate;
        this.flightRoute = flightRoute;
        this.bookingStatus = bookingStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "BookingStatusModel{" +
                "bookingId='" + bookingId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", bookingDate=" + bookingDate +
                ", flightRoute='" + flightRoute + '\'' +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }
}
