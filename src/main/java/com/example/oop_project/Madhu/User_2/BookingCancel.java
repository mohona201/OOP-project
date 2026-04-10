package com.example.oop_project.Madhu.User_2;

import java.time.LocalDate;

public class BookingCancel {
    public String bookingId;
    public String bookingService;
    public LocalDate bookingDate;
    public String flightRoute;
    public String flightStatus;
    public String reason;

    public BookingCancel(String bookingId, String bookingService, LocalDate bookingDate, String flightRoute, String flightStatus, String reason) {
        this.bookingId = bookingId;
        this.bookingService = bookingService;
        this.bookingDate = bookingDate;
        this.flightRoute = flightRoute;
        this.flightStatus = flightStatus;
        this.reason = reason;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingService() {
        return bookingService;
    }

    public void setBookingService(String bookingService) {
        this.bookingService = bookingService;
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

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "BookingCancelModel{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingService='" + bookingService + '\'' +
                ", bookingDate=" + bookingDate +
                ", flightRoute='" + flightRoute + '\'' +
                ", flightStatus='" + flightStatus + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
