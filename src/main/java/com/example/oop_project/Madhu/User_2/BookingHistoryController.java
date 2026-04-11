package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class BookingHistoryController {
    @javafx.fxml.FXML
    private TableView <DashBoard>historyTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <DashBoard,String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <DashBoard,String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn <DashBoard,String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn <DashBoard,String> routeTableColumn;

    ArrayList<DashBoard> bookingHistoryList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<DashBoard, String>("bookingId"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<DashBoard, String>("status"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<DashBoard, String>("flightId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<DashBoard, String>("route"));
        historyTable.getItems().clear();
        CommonMethod.showTableDataFromBinFile("Booking.bin", historyTable);

        bookingHistoryList.clear();
        bookingHistoryList.addAll(historyTable.getItems());

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
        historyTable.getItems().clear();
        CommonMethod.showTableDataFromBinFile("Booking.bin", historyTable);

        bookingHistoryList.clear();
        bookingHistoryList.addAll(historyTable.getItems());
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {

        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}