package com.example.oop_project.Madhu.User2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

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


        bookingIDColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("bookingID"));

        statusColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("status"));

        serviceNameColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("serviceName"));

        routeColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("route"));

        dateColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, LocalDate>("date"));

        CommonMethod.showTableDataFromBinFile("BookingStatus.bin", statusTable);

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