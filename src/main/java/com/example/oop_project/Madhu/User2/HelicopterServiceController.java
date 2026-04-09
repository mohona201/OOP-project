package com.example.oop_project.Madhu.User2;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.util.ArrayList;

public class HelicopterServiceController {
    @javafx.fxml.FXML
    private TableView <HelicopterService>searchTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,Integer>capacityColumn;
    @javafx.fxml.FXML
    private TextField typeTextField;
    @javafx.fxml.FXML
    private TextField capacityTextField;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String>availabilityColumn;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String>serviceNameColumn;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String>helicopterTypeColumn;
    @javafx.fxml.FXML
    private TextField serviceNameTextField;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String>serviceIdColumn;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,Integer>priceColumn;


    ArrayList<HelicopterService>helicopterServiceList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetOnAction(ActionEvent actionEvent) {
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