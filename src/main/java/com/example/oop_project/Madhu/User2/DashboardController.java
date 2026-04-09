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
    private TableColumn <Dashboard,Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> availabilityTableColumn;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> serviceNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> helicopterTypeTableColumn;
    @javafx.fxml.FXML
    private TableView <Dashboard>serviceTable;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> serviceIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer> priceTableColumn;

    ArrayList<Dashboard> dashboards= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("capacity"));
        availabilityTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("flightAvailability"));
        serviceNameTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("serviceName"));
        helicopterTypeTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("helicopterType"));
        serviceIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("serviceId"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("flightPrice"));

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
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Book Helicopter .fxml");
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