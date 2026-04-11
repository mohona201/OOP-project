package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class FeedbackController {
    @javafx.fxml.FXML
    private TableView <UserBooking>bookingTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private RadioButton rating8RadioButton;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String> routeTableColumn;
    @javafx.fxml.FXML
    private RadioButton rating5RadioButton;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String> flightIdTableColumn;
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
    private TableColumn <UserBooking,String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TextArea feedbackTextArea;
    @javafx.fxml.FXML
    private RadioButton rating6RadioButton;
    @javafx.fxml.FXML
    private RadioButton rating4RadioButton;

    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
        tg = new ToggleGroup();
        rating1RadioButton.setToggleGroup(tg);
        rating2RadioButton.setToggleGroup(tg);
        rating3RadioButton.setToggleGroup(tg);
        rating4RadioButton.setToggleGroup(tg);
        rating5RadioButton.setToggleGroup(tg);
        rating6RadioButton.setToggleGroup(tg);
        rating7RadioButton.setToggleGroup(tg);
        rating8RadioButton.setToggleGroup(tg);
        rating9RadioButton.setToggleGroup(tg);


        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("bookingId"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("flightId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("route"));

        CommonMethod.showTableDataFromBinFile("Booking.bin", bookingTable);

        bookingTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                feedbackTextArea1.setText(newVal.getBookingId());
            }
        });
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
        String bookingId = feedbackTextArea1.getText().trim();
        String comments = feedbackTextArea.getText().trim();
        RadioButton selectedRating = (RadioButton) tg.getSelectedToggle();

        if (comments.isEmpty()) {
            CommonMethod.showError("Please enter your feedback comments.");
            return;
        }

        Integer rating = 0;
        if (selectedRating != null) {
            rating = Integer.parseInt(selectedRating.getText());
        } else {
            CommonMethod.showError("Please select a rating.");
            return;
        }

        UserBooking selectedBooking = bookingTable.getSelectionModel().getSelectedItem();
        String flightId = selectedBooking != null ? selectedBooking.getFlightId() : "N/A";
        String route = selectedBooking != null ? selectedBooking.getRoute() : "N/A";
        LocalDate date = LocalDate.now();

        Feedback fb = new Feedback(bookingId.isEmpty() ? "N/A" : bookingId, flightId, date, route, comments, rating);

        ArrayList<Feedback> fbList = new ArrayList<>();
        fbList.add(fb);
        CommonMethod.saveToBinFile("Feedback.bin", fbList);

        CommonMethod.showInformation("Success", "Feedback submitted successfully.");

        feedbackTextArea.clear();
        feedbackTextArea1.clear();
        tg.selectToggle(null);
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
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}