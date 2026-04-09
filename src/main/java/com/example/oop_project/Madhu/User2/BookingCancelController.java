package com.example.oop_project.Madhu.User2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookingCancelController {
    @javafx.fxml.FXML
    private TableView <BookingCancel>bookingTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TextArea reasonTextArea1;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>bookingIDColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>statusColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>routeColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>serviceColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel, LocalDate>dateColumn;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;

    ArrayList<BookingCancel> bookingCancelList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        bookingIDColumn.setCellValueFactory(new PropertyValueFactory<BookingCancel, String>("bookingID"));

        statusColumn.setCellValueFactory(new PropertyValueFactory<BookingCancel, String>("status"));

        routeColumn.setCellValueFactory(new PropertyValueFactory<BookingCancel, String>("route"));

        serviceColumn.setCellValueFactory(new PropertyValueFactory<BookingCancel, String>("service"));

        dateColumn.setCellValueFactory(new PropertyValueFactory<BookingCancel, LocalDate>("date"));

        CommonMethod.showTableDataFromBinFile("BookingCancel.bin", bookingTable);
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