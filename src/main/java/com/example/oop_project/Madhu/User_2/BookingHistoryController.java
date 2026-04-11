package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookingHistoryController {
    @javafx.fxml.FXML
    private TableView <UserBooking>historyTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String> routeTableColumn;

    ArrayList<UserBooking> bookingHistoryList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("bookingId"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("status"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("flightId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("route"));

        CommonMethod.showTableDataFromBinFile("Booking.bin", historyTable);

    }



    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/CancelsBooking.fxml");
    }

    @javafx.fxml.FXML
    public void paymentsOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Payment.fxml");
    }

    @javafx.fxml.FXML
    public void bookFlightOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookHelicopter.fxml");
    }

    @javafx.fxml.FXML
    public void bookingHistoryOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookingHistory.fxml");
    }

    @javafx.fxml.FXML
    public void servicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightStatusOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookingStatus.fxml");
    }

    @javafx.fxml.FXML
    public void searchServicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/HelicopterServices.fxml");
    }

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void filterOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}