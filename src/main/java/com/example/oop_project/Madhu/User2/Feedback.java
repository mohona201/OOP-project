package com.example.oop_project.Madhu.User2;

import java.time.LocalDate;

public class Feedback {
    public String bookingId;
    public String service;
    public LocalDate flightDate;
    public String flightRoute;
    public String customerFeedback;
    public Integer customerRating;

    public Feedback(String bookingId, String service, LocalDate flightDate, String flightRoute, String customerFeedback, Integer customerRating) {
        this.bookingId = bookingId;
        this.service = service;
        this.flightDate = flightDate;
        this.flightRoute = flightRoute;
        this.customerFeedback = customerFeedback;
        this.customerRating = customerRating;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    public Integer getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(Integer customerRating) {
        this.customerRating = customerRating;
    }

    @Override
    public String toString() {
        return "FeedbackModel{" +
                "bookingId='" + bookingId + '\'' +
                ", service='" + service + '\'' +
                ", flightDate=" + flightDate +
                ", flightRoute='" + flightRoute + '\'' +
                ", customerFeedback='" + customerFeedback + '\'' +
                ", customerRating=" + customerRating +
                '}';
    }
}
