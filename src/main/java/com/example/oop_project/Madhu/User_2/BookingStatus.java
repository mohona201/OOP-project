package com.example.oop_project.Madhu.User_2;

import java.io.Serializable;
import java.time.LocalDate;

public class BookingStatus implements Serializable {
    public String bookingId;
    public LocalDate bookingDate;
    public String flightRoute;
    public String bookingStatus;


    public BookingStatus(String bookingId, LocalDate bookingDate, String flightRoute, String bookingStatus) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.flightRoute = flightRoute;
        this.bookingStatus = bookingStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "BookingStatus{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDate=" + bookingDate +
                ", flightRoute='" + flightRoute + '\'' +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }
}
