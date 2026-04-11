package com.example.oop_project.Erin.fom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class WeatherRiskController {
    @FXML private TextField visibilityField, windSpeedField;
    @FXML private TextArea resultArea;

    @FXML
    void handleCheckWeather(ActionEvent event) {
        try {
            double vis = Double.parseDouble(visibilityField.getText());
            double wind = Double.parseDouble(windSpeedField.getText());

            if (vis < 5 || wind > 30) {
                resultArea.setText("STATUS: HIGH RISK\nRecommendation: Ground all non-emergency flights.");
            } else {
                resultArea.setText("STATUS: CLEAR\nRecommendation: Operations normal.");
            }
        } catch (NumberFormatException e) {
            resultArea.setText("Error: Please enter valid numbers.");
        }
    }
}