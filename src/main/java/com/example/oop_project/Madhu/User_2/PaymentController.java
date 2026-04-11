package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import javafx.scene.control.cell.PropertyValueFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PaymentController {
    @javafx.fxml.FXML
    private Label amountLabel;
    @javafx.fxml.FXML
    private Label bookingIdLabel;
    @javafx.fxml.FXML
    private Label serviceLabel;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private ComboBox <String>paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableView<DashBoard> pendingBookingsTable;
    @javafx.fxml.FXML
    private TableColumn<DashBoard, String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<DashBoard, String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<DashBoard, String> statusTableColumn;

    ArrayList<DashBoard> allBookings = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        paymentMethodComboBox.getItems().addAll("Cash", "Card", "Bkash", "Nagad", "Rocket");

        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<DashBoard, String>("bookingId"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<DashBoard, String>("flightId"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<DashBoard, String>("status"));
    }

    private void loadAllBookings() {

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
    public void confirmPaymentOnAction(ActionEvent actionEvent) {
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
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}