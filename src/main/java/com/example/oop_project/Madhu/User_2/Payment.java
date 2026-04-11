package com.example.oop_project.Madhu.User_2;

public class Payment {
    public String bookingId,flightId;
    public String status;
    public Integer bookingAmount;
    public String paymentMethod;


    public Payment(String bookingId, String flightId, String status, Integer bookingAmount, String paymentMethod) {
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.status = status;
        this.bookingAmount = bookingAmount;
        this.paymentMethod = paymentMethod;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getStatus() {
        return status;
    }

    public Integer getBookingAmount() {
        return bookingAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBookingAmount(Integer bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "bookingId='" + bookingId + '\'' +
                ", flightId='" + flightId + '\'' +
                ", status='" + status + '\'' +
                ", bookingAmount=" + bookingAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
