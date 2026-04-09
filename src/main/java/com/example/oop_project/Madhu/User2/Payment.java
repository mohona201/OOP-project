package com.example.oop_project.Madhu.User2;

public class Payment {
    public String bookingId;
    public String service;
    public Integer bookingAmount;
    public String paymentMethod;

    public Payment(String bookingId, String service, Integer bookingAmount, String paymentMethod) {
        this.bookingId = bookingId;
        this.service = service;
        this.bookingAmount = bookingAmount;
        this.paymentMethod = paymentMethod;
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

    public Integer getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Integer bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentModel{" +
                "bookingId='" + bookingId + '\'' +
                ", service='" + service + '\'' +
                ", bookingAmount=" + bookingAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
