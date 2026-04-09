package com.example.oop_project.Madhu.User2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class HelicopterServiceController {
    @javafx.fxml.FXML
    private TableView <HelicopterService>searchTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private TextField typeTextField;
    @javafx.fxml.FXML
    private TextField capacityTextField;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String> availabilityTableColumn;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String> serviceNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String> helicopterTypeTableColumn;
    @javafx.fxml.FXML
    private TextField serviceNameTextField;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,String> serviceIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <HelicopterService,Integer> priceTableColumn;


    ArrayList<HelicopterService>helicopterServiceList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<HelicopterService, Integer>("capacity"));
        availabilityTableColumn.setCellValueFactory(new PropertyValueFactory<HelicopterService, String>("flightAvailability"));
        serviceNameTableColumn.setCellValueFactory(new PropertyValueFactory<HelicopterService, String>("serviceName"));
        helicopterTypeTableColumn.setCellValueFactory(new PropertyValueFactory<HelicopterService, String>("helicopterType"));
        serviceIdTableColumn.setCellValueFactory(new PropertyValueFactory<HelicopterService, String>("serviceId"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<HelicopterService, Integer>("servicePrice"));

        CommonMethod.showTableDataFromBinFile("HelicopterService.bin", searchTable);
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
    public void logoutOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
    }
}