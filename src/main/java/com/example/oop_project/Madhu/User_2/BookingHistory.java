package com.example.oop_project.Madhu.User_2;

import java.io.Serializable;
import java.time.LocalDate;

public class BookingHistory implements Serializable {
    public String bookingId;
    //public String serviceName;
    public LocalDate date;
    public String route;
    public String status;

    public BookingHistory(String bookingId, LocalDate date, String route, String status) {
        this.bookingId = bookingId;
        this.date = date;
        this.route = route;
        this.status = status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getRoute() {
        return route;
    }

    public String getStatus() {
        return status;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookingHistory{" +
                "bookingId='" + bookingId + '\'' +
                ", date=" + date +
                ", route='" + route + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
