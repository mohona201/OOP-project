package com.example.oop_project.Madhu.User_2;

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
    private TableColumn <BookingStatus,String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus,String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus,String> serviceNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus,String> routeTableColumn;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableColumn <BookingStatus, LocalDate> dateTableColumn;

    ArrayList<BookingStatus> bookingStatusList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {


        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("bookingId"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("bookingStatus"));
        serviceNameTableColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("serviceName"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, String>("flightRoute"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<BookingStatus, LocalDate>("bookingDate"));

        CommonMethod.showTableDataFromBinFile("BookingStatus.bin", statusTable);

    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
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
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookHelicopter .fxml");
    }

    @javafx.fxml.FXML
    public void bookingHistoryOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookingHistory.fxml");
    }

    @javafx.fxml.FXML
    public void servicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/HelicopterServices.fxml");
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
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}