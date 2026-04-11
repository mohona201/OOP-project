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

        loadAllBookings();

        pendingBookingsTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                bookingIdLabel.setText(newVal.getBookingId());
                serviceLabel.setText(newVal.getFlightId());
                amountLabel.setText(String.valueOf(newVal.getAmount()) + " BDT");
            }
        });
    }

    private void loadAllBookings() {
        allBookings.clear();
        pendingBookingsTable.getItems().clear();
        ObjectInputStream ois = null;
        try {
            File file = new File("data/Booking.bin");
            if (file.exists() && file.length() > 0) {
                ois = new ObjectInputStream(new FileInputStream(file));
                while (true) {
                    DashBoard b = (DashBoard) ois.readObject();
                    allBookings.add(b);
                    if ("Pending".equals(b.getStatus())) {
                        pendingBookingsTable.getItems().add(b);
                    }
                }
            }
        } catch (Exception e) {
            // EOFException expected
        } finally {
            try { if (ois != null) ois.close(); } catch (Exception e) {}
        }
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
        DashBoard selectedBooking = pendingBookingsTable.getSelectionModel().getSelectedItem();
        String method = paymentMethodComboBox.getValue();
        String amountText = amountTextField.getText().trim();

        if (selectedBooking == null) {
            CommonMethod.showError("Please select a pending booking from the table.");
            return;
        }

        if (method == null || method.isEmpty() || amountText.isEmpty()) {
            CommonMethod.showError("Please provide payment method and amount.");
            return;
        }

        try {
            int enteredAmount = Integer.parseInt(amountText);
            if (enteredAmount < selectedBooking.getAmount()) {
                CommonMethod.showError("Amount must be at least " + selectedBooking.getAmount() + " BDT.");
                return;
            }
        } catch (NumberFormatException e) {
            CommonMethod.showError("Amount must be a valid number.");
            return;
        }

        // Update status in the main list
        for (DashBoard b : allBookings) {
            if (b.getBookingId().equals(selectedBooking.getBookingId())) {
                b.setStatus("Confirmed"); // Paid
                break;
            }
        }

        // Rewrite entire Booking.bin
        File file = new File("data/Booking.bin");
        if (file.exists()) file.delete();
        CommonMethod.saveToBinFile("Booking.bin", allBookings);

        CommonMethod.showInformation("Success", "Payment confirmed. Booking status updated.");
        
        amountTextField.clear();
        paymentMethodComboBox.setValue(null);
        bookingIdLabel.setText("N/A");
        serviceLabel.setText("N/A");
        amountLabel.setText("N/A");

        loadAllBookings(); // refresh table
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