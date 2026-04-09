package com.example.oop_project.Madhu.User2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class BookHelicopterController {
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView <BookHelicopter>serviceTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private TextField destinationTextField;
    @javafx.fxml.FXML
    private TextField passengerTextField;
    @javafx.fxml.FXML
    private TextField departureTextField;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,String> serviceNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,String> helicopterTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,String> serviceIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookHelicopter,Integer> priceTableColumn;

    ArrayList<BookHelicopter>bookHelicopterList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter,Integer>("capacity"));

        serviceIdTableColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, String>("serviceId"));

        serviceNameTableColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, String>("serviceName"));

        helicopterTypeTableColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, String>("helicopterType"));

        priceTableColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, Integer>("price"));

        CommonMethod.showTableDataFromBinFile("BookHelicopter.bin",serviceTable);


    }


    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Cancels .fxml");
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