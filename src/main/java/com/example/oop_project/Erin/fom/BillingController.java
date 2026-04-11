package com.example.oop_project.Erin.fom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.helicopter_service.Erin.models.Flight;

import java.util.List;

public class BillingController {
    @FXML private Label totalFlights, totalRevenue;

    @FXML
    void generateReport() {
        List<Flight> flights = FileManager.readObjectsFromFile("FlightData.bin");
        if (flights == null) return;

        int count = 0;
        double revenue = 0;

        for (Flight f : flights) {
            // Only count flights that aren't cancelled or pending
            if (f.getStatus().equals("Completed") || f.getStatus().equals("Dispatched")) {
                count++;
                revenue += 1500.00; // Example flat rate per flight
            }
        }

        totalFlights.setText(String.valueOf(count));
        totalRevenue.setText("$" + String.format("%.2f", revenue));
    }
}