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

        capacityColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter,Integer>("capacity"));

        serviceIdColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, String>("serviceId"));

        serviceNameColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, String>("serviceName"));

        helicopterTypeColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, String>("helicopterType"));

        priceColumn.setCellValueFactory(new PropertyValueFactory<BookHelicopter, Integer>("price"));

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