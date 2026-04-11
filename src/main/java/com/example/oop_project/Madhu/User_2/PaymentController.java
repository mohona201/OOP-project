package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class PaymentController {
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableColumn<Payment, String> bookingIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, Integer> amountTableColumn1;
    @javafx.fxml.FXML
    private TableView<Payment> paymentTableView;

    ArrayList<Payment> paymentList = new ArrayList<>();
    Integer loadedAmount = null;

    @javafx.fxml.FXML
    public void initialize() {
        paymentMethodComboBox.getItems().addAll("Cash", "Card", "Bkash", "Nagad", "Rocket");

        bookingIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("flightId"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        amountTableColumn1.setCellValueFactory(new PropertyValueFactory<>("bookingAmount"));

        loadAllBookings();
    }

    private void loadAllBookings() {
        paymentTableView.getItems().clear();
        CommonMethod.showTableDataFromBinFile("Payment.bin", paymentTableView);

        paymentList.clear();
        paymentList.addAll(paymentTableView.getItems());
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
    public void confirmPaymentOnAction(ActionEvent actionEvent) {
        Payment selectedPayment = paymentTableView.getSelectionModel().getSelectedItem();
        String method = paymentMethodComboBox.getValue();

        if (selectedPayment == null) {
            CommonMethod.showError("Selection Missing", "Please select a payment row.");
            return;
        }

        if (method == null || method.isEmpty()) {
            CommonMethod.showError("Information Missing", "Please select payment method.");
            return;
        }

        if (loadedAmount == null) {
            CommonMethod.showError("Amount Missing", "Please click LoadAmount first.");
            return;
        }

        selectedPayment.setStatus("Paid");
        selectedPayment.setPaymentMethod(method);
        selectedPayment.setBookingAmount(loadedAmount);

        paymentTableView.refresh();
        CommonMethod.showConfirmation("Success", "Payment confirmed successfully.");

        paymentMethodComboBox.setValue(null);
        loadedAmount = null;
        paymentTableView.getSelectionModel().clearSelection();
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

    @javafx.fxml.FXML
    public void loadAmountOnAction(ActionEvent actionEvent) {
        Payment selectedPayment = paymentTableView.getSelectionModel().getSelectedItem();

        if (selectedPayment == null) {
            CommonMethod.showError("Selection Missing", "Please select a payment row first.");
            return;
        }

        loadedAmount = selectedPayment.getBookingAmount();
        CommonMethod.showInformation("Loaded Amount", "Amount loaded: " + loadedAmount);
    }
}