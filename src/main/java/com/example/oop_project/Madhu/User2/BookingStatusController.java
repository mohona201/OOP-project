package com.example.oop_project.Madhu.User2;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookingStatusController {
    @javafx.fxml.FXML
    private TableView <BookingStatus>statusTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus,String>bookingIDColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus,String>statusColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus,String>serviceNameColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus,String>routeColumn;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus, LocalDate>dateColumn;

    ArrayList<BookingStatus> bookingStatusList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
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
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
    }
}