package com.example.oop_project.Erin.fom;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class BDODashboardController {

    @FXML private VBox contentArea; // The center pane of your dashboard

    // This helper method does the heavy lifting
    private void loadGoal(String fxmlFileName) {
        try {
            // Important: This path must match your folder structure exactly
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/helicopter_service/Erin/" + fxmlFileName));
            Parent view = loader.load();

            // This replaces whatever is in the center with the new goal screen
            contentArea.getChildren().setAll(view);
        } catch (IOException e) {
            System.err.println("Could not load: " + fxmlFileName);
            e.printStackTrace();
        }
    }

    // Now, update your button methods to use the switcher
    @FXML void openBooking() { loadGoal("BookingManager.fxml"); }
    @FXML void openDispatch() { loadGoal("FlightDispatch.fxml"); }
    @FXML void openSchedule() { loadGoal("FlightSchedule.fxml"); }
    @FXML void openEmergency() { loadGoal("EmergencyDispatch.fxml"); }
    @FXML void openFuelLoad() { loadGoal("FuelLoadCalculator.fxml"); }
    @FXML void openFeedback() { loadGoal("PassengerFeedback.fxml"); }
    @FXML void openLogs() { loadGoal("FlightLogs.fxml"); }
    @FXML void openBilling() { loadGoal("BillingReports.fxml"); }

    @FXML void handleLogout() { System.exit(0); }
}