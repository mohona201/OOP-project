package com.example.oop_project.Erin.fom;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FuelLoadController {
    @FXML private TextField passWeight, cargoWeight, fuelAmount;
    @FXML private Label resultLabel;

    @FXML
    void calculateLoad() {
        try {
            double pWeight = Double.parseDouble(passWeight.getText());
            double cWeight = Double.parseDouble(cargoWeight.getText());
            double fuelLiters = Double.parseDouble(fuelAmount.getText());

            // 1 Liter of Jet A1 fuel is roughly 0.8 kg
            double fuelWeight = fuelLiters * 0.8;
            double totalLoad = pWeight + cWeight + fuelWeight;

            // Example threshold: 1200kg limit for a small heli
            if (totalLoad > 1200) {
                resultLabel.setText("🚨 OVERWEIGHT: " + totalLoad + " kg (Limit 1200)");
                resultLabel.setStyle("-fx-text-fill: red;");
            } else {
                resultLabel.setText("✅ LOAD SECURE: " + totalLoad + " kg");
                resultLabel.setStyle("-fx-text-fill: green;");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter numbers.");
        }
    }
}