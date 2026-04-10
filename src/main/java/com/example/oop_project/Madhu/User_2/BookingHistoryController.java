package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookingHistoryController {
    @javafx.fxml.FXML
    private TableView <BookingHistory>historyTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn <BookingHistory,String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingHistory,String> statusTableColumn;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn <BookingHistory,String> serviceNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingHistory,String> routeTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingHistory, LocalDate> dateTableColumn;

    ArrayList<BookingHistory> bookingHistoryList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<BookingHistory, String>("bookingId"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<BookingHistory, String>("status"));
        serviceNameTableColumn.setCellValueFactory(new PropertyValueFactory<BookingHistory, String>("serviceName"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<BookingHistory, String>("route"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<BookingHistory, LocalDate>("date"));

        CommonMethod.showTableDataFromBinFile("BookingHistory.bin", historyTable);

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
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Book Helicopter .fxml");
    }

    @javafx.fxml.FXML
    public void bookingHistoryOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Booking History.fxml");
    }

    @javafx.fxml.FXML
    public void servicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Helicopter Services.fxml");
    }

    @javafx.fxml.FXML
    public void flightStatusOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Booking Status.fxml");
    }

    @javafx.fxml.FXML
    public void searchServicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Helicopter Services.fxml");
    }

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Login.fxml");
    }

    @javafx.fxml.FXML
    public void filterOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}