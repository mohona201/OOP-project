package com.example.oop_project.Madhu.User2;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookingCancelController {
    @javafx.fxml.FXML
    private TableView <BookingCancel>bookingTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TextArea reasonTextArea1;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>bookingIDColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>statusColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>routeColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>serviceColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel, LocalDate>dateColumn;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;

    ArrayList<BookingCancel> bookingCancelList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void paymentsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bookFlightOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bookingHistoryOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void servicesOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flightStatusOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchServicesOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
    }
}