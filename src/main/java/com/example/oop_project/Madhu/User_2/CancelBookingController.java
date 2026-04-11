package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import javafx.scene.control.cell.PropertyValueFactory;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class CancelBookingController
{
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String>statusTableColumn;
    @javafx.fxml.FXML
    private TextArea reasonTextArea1;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String>bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableView <UserBooking>bookingTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String>flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UserBooking,String>routeTableColumn;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("bookingId"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("status"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("flightId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<UserBooking, String>("route"));

        CommonMethod.showTableDataFromBinFile("Booking.bin", bookingTable);
        
        bookingTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                reasonTextArea1.setText(newVal.getBookingId());
            }
        });
    }

    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
        UserBooking selectedBooking = bookingTable.getSelectionModel().getSelectedItem();
        String reason = reasonTextArea.getText().trim();

        if (selectedBooking == null) {
            CommonMethod.showError("Please select a booking to cancel.");
            return;
        }

        if (reason.isEmpty()) {
            CommonMethod.showError("Please provide a reason for cancellation.");
            return;
        }

        if (selectedBooking.getStatus().equals("Cancelled")) {
            CommonMethod.showError("This booking is already cancelled.");
            return;
        }

        selectedBooking.setStatus("Cancelled");

        // Rewrite the file
        File file = new File("data/Booking.bin");
        if (file.exists()) {
            file.delete();
        }

        ArrayList<UserBooking> allBookings = new ArrayList<>(bookingTable.getItems());
        CommonMethod.saveToBinFile("Booking.bin", allBookings);

        CommonMethod.showInformation("Success", "Booking cancelled successfully.");
        bookingTable.refresh();
        reasonTextArea.clear();
        reasonTextArea1.clear();
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
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}