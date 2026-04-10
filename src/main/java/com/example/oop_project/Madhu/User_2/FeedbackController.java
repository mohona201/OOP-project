package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class FeedbackController {
    @javafx.fxml.FXML
    private TableView <Feedback>bookingTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private RadioButton rating8RadioButton;
    @javafx.fxml.FXML
    private TableColumn <Feedback,String> routeTableColumn;
    @javafx.fxml.FXML
    private RadioButton rating5RadioButton;
    @javafx.fxml.FXML
    private TableColumn <Feedback,String> serviceTableColumn;
    @javafx.fxml.FXML
    private TextArea feedbackTextArea1;
    @javafx.fxml.FXML
    private RadioButton rating3RadioButton;
    @javafx.fxml.FXML
    private RadioButton rating1RadioButton;
    @javafx.fxml.FXML
    private RadioButton rating2RadioButton;
    @javafx.fxml.FXML
    private RadioButton rating9RadioButton;
    @javafx.fxml.FXML
    private RadioButton rating7RadioButton;
    @javafx.fxml.FXML
    private TableColumn <Feedback,String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TextArea feedbackTextArea;
    @javafx.fxml.FXML
    private RadioButton rating6RadioButton;
    @javafx.fxml.FXML
    private TableColumn <Feedback, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private RadioButton rating4RadioButton;

    ArrayList<Feedback>feedbackList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<Feedback, String>("bookingId"));
        serviceTableColumn.setCellValueFactory(new PropertyValueFactory<Feedback, String>("service"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<Feedback, String>("flightRoute"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Feedback, LocalDate>("flightDate"));

        CommonMethod.showTableDataFromBinFile("Feedback.bin", bookingTable);

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
    public void submitFeedbackOnAction(ActionEvent actionEvent) {
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