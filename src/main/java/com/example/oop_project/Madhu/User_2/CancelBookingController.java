package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.time.LocalDate;

public class CancelBookingController
{
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>statusTableColumn;
    @javafx.fxml.FXML
    private TextArea reasonTextArea1;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableView <BookingCancel>bookingTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>serviceTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel,String>routeTableColumn;
    @javafx.fxml.FXML
    private TableColumn <BookingCancel, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;

    @javafx.fxml.FXML
    public void initialize() {
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
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}