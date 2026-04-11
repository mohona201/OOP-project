package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import com.example.oop_project.Madhu.User_1.Dashboard;

import java.time.LocalDate;
import java.util.ArrayList;

public class BookHelicopterController {
    @javafx.fxml.FXML
    private TableView <Dashboard>serviceTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> helicopterIdTableColumn;
    @javafx.fxml.FXML
    private TextField FlightIDTextField;
    @javafx.fxml.FXML
    private TextField destinationTextField;
    @javafx.fxml.FXML
    private TextField passengerTextField;
    @javafx.fxml.FXML
    private TextField departureTextField;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> routeTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> departureTimeTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard, LocalDate> dateTableColumn;

    ArrayList<DashBoard> bookingList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("flightId"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, LocalDate>("flightDate"));
        helicopterIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("helicopterId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("flightRoute"));
        departureTimeTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("departureTime"));

        CommonMethod.showTableDataFromBinFile("AssignedFlightManager.bin",serviceTable);
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
    public void confirmBookingOnAction(ActionEvent actionEvent) {
        String flightId = FlightIDTextField.getText().trim();
        String departure = departureTextField.getText().trim();
        String destination = destinationTextField.getText().trim();
        String passengerText = passengerTextField.getText().trim();

        bookingList = new ArrayList<>();

        if (flightId.isEmpty() || departure.isEmpty() || destination.isEmpty() || passengerText.isEmpty()) {
            CommonMethod.showError("Information Missing", "Please fill in all fields.");
            return;
        }

        if (!passengerText.matches("\\d+")) {
            CommonMethod.showError("invalid Passenger", "Passenger must be a number.");
            return;
        }

        int passengers = Integer.parseInt(passengerText);
        String route = departure + " to " + destination;
        int amount = passengers * 5000;
        LocalDate date = LocalDate.now();

        DashBoard newBooking = new DashBoard("B001", flightId, route, "Pending", departure, destination, passengers, amount);

        bookingList.add(newBooking);
        CommonMethod.saveToBinFile("Booking.bin", bookingList);

        CommonMethod.showConfirmation("Success", "Booking confirmed successfully.");

        FlightIDTextField.clear();
        departureTextField.clear();
        destinationTextField.clear();
        passengerTextField.clear();
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
    public void searchServicesOnAction(ActionEvent actionEvent){
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