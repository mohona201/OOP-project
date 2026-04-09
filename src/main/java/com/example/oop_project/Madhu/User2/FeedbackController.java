package com.example.oop_project.Madhu.User2;

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
    private TableColumn <Feedback,String>routeColumn;
    @javafx.fxml.FXML
    private RadioButton rating5RadioButton;
    @javafx.fxml.FXML
    private TableColumn <Feedback,String>serviceColumn;
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
    private TableColumn <Feedback,String>bookingIDColumn;
    @javafx.fxml.FXML
    private TextArea feedbackTextArea;
    @javafx.fxml.FXML
    private RadioButton rating6RadioButton;
    @javafx.fxml.FXML
    private TableColumn <Feedback, LocalDate>dateColumn;
    @javafx.fxml.FXML
    private RadioButton rating4RadioButton;

    ArrayList<Feedback>feedbackList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        bookingIDColumn.setCellValueFactory(new PropertyValueFactory<Feedback, String>("bookingId"));
        serviceColumn.setCellValueFactory(new PropertyValueFactory<Feedback, String>("service"));
        routeColumn.setCellValueFactory(new PropertyValueFactory<Feedback, String>("flightRoute"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<Feedback, LocalDate>("flightDate"));

        CommonMethod.showTableDataFromBinFile("Feedback.bin", bookingTable);

    }

    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void paymentsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitFeedbackOnAction(ActionEvent actionEvent) {
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