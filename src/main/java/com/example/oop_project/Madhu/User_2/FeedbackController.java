package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class FeedbackController {
    @javafx.fxml.FXML
    private TableView<DashBoard> bookingTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private RadioButton rating8RadioButton;
    @javafx.fxml.FXML
    private TableColumn<DashBoard, String> routeTableColumn;
    @javafx.fxml.FXML
    private RadioButton rating5RadioButton;
    @javafx.fxml.FXML
    private TableColumn<DashBoard, String> flightIdTableColumn;
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
    private TableColumn<DashBoard, String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TextArea feedbackTextArea;
    @javafx.fxml.FXML
    private RadioButton rating6RadioButton;
    @javafx.fxml.FXML
    private RadioButton rating4RadioButton;
    @javafx.fxml.FXML
    private TableColumn<DashBoard, LocalDate> datePicker;

    ToggleGroup tg;
    ArrayList<Feedback> feedbackList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        tg = new ToggleGroup();

        for (RadioButton r : new RadioButton[]{
                rating1RadioButton,
                rating2RadioButton,
                rating3RadioButton,
                rating4RadioButton,
                rating5RadioButton,
                rating6RadioButton,
                rating7RadioButton,
                rating8RadioButton,
                rating9RadioButton
        }) {
            r.setToggleGroup(tg);
        }

        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("flightId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<>("route"));

        bookingTable.getItems().clear();
        CommonMethod.showTableDataFromBinFile("Booking.bin", bookingTable);
    }

    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/CancelsBooking.fxml");
    }

    @javafx.fxml.FXML
    public void paymentsOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/Payment.fxml");
    }

    @javafx.fxml.FXML
    public void submitFeedbackOnAction(ActionEvent actionEvent) {
        String bookingId = feedbackTextArea1.getText().trim();
        String comments = feedbackTextArea.getText().trim();

        if (bookingId.isEmpty() || comments.isEmpty() || tg.getSelectedToggle() == null) {
            CommonMethod.showError("Information Missing", "Please fill in all fields.");
            return;
        }

        DashBoard selectedBooking = bookingTable.getSelectionModel().getSelectedItem();

        if (selectedBooking == null) {
            CommonMethod.showError("Selection Missing", "Please select a booking from the table.");
            return;
        }

        RadioButton selected = (RadioButton) tg.getSelectedToggle();
        Integer rating = Integer.parseInt(selected.getText());

        feedbackList = new ArrayList<>();
        feedbackList.add(new Feedback(bookingId, selectedBooking.getFlightId(), LocalDate.now(), selectedBooking.getRoute(), comments, rating));

        CommonMethod.saveToBinFile("Feedback.bin", feedbackList);
        CommonMethod.showConfirmation("Success", "Feedback submitted successfully.");

        feedbackTextArea1.clear();
        feedbackTextArea.clear();
        tg.selectToggle(null);
    }

    @javafx.fxml.FXML
    public void bookFlightOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/BookHelicopter.fxml");
    }

    @javafx.fxml.FXML
    public void bookingHistoryOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/BookingHistory.fxml");
    }

    @javafx.fxml.FXML
    public void servicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightStatusOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/BookingStatus.fxml");
    }

    @javafx.fxml.FXML
    public void searchServicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/HelicopterServices.fxml");
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/Feedback.fxml");
    }
}