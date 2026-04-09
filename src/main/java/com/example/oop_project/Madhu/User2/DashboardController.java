package com.example.oop_project.Madhu.User2;

import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class DashboardController
{
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer>capacityColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String>availabilityColumn;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String>serviceNameColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String>helicopterTypeColumn;
    @javafx.fxml.FXML
    private TableView <Dashboard>serviceTable;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String>serviceIdColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer>priceColumn;

    ArrayList<Dashboard> dashboards= new ArrayList<>();

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
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
    }
}