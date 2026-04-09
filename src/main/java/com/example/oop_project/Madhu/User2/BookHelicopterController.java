package com.example.oop_project.Madhu.User2;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.util.ArrayList;

public class BookHelicopterController {
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView <BookHelicopter>serviceTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,Integer>capacityColumn;
    @javafx.fxml.FXML
    private TextField destinationTextField;
    @javafx.fxml.FXML
    private TextField passengerTextField;
    @javafx.fxml.FXML
    private TextField departureTextField;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,String>serviceNameColumn;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,String>helicopterTypeColumn;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,String>serviceIdColumn;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,Integer>priceColumn;

    ArrayList<BookHelicopter>bookHelicopterList= new ArrayList<>();

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
    public void confirmBookingOnAction(ActionEvent actionEvent) {
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