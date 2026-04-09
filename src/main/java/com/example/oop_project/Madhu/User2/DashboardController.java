package com.example.oop_project.Madhu.User2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
        capacityColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("capacity"));
        availabilityColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("flightAvailability"));
        serviceNameColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("serviceName"));
        helicopterTypeColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("helicopterType"));
        serviceIdColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("serviceId"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("flightPrice"));

        CommonMethod.showTableDataFromBinFile("Dashboard.bin", serviceTable);
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