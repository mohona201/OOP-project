package com.example.oop_project.Madhu.User_2;

import java.io.Serializable;
import java.time.LocalDate;

public class Feedback implements Serializable {
    public String bookingId;
    public String flightId;
    public LocalDate flightDate;
    public String flightRoute;
    public String customerFeedback;
    public Integer customerRating;

    public Feedback(String bookingId, String flightId, LocalDate flightDate, String flightRoute, String customerFeedback, Integer customerRating) {
        this.bookingId = bookingId;
        this.flightId = flightId;
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

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
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
                ", flightId='" + flightId + '\'' +
                ", flightDate=" + flightDate +
                ", flightRoute='" + flightRoute + '\'' +
                ", customerFeedback='" + customerFeedback + '\'' +
                ", customerRating=" + customerRating +
                '}';
    }
}
