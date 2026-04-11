package com.example.oop_project.Erin.fom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class FOMDashboardController {

    @FXML private AnchorPane contentDisplayArea;

    private void loadUI(String fxmlFile) {
        try {
            // CRITICAL: Leading slash and exact path
            String path = "/org/example/helicopter_service/Erin/" + fxmlFile;
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Parent root = loader.load();

            // Clear current view and set new one
            contentDisplayArea.getChildren().setAll(root);

            // Anchor to all sides so it resizes
            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setBottomAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);

        } catch (Exception e) {
            System.err.println("Failed to load: " + fxmlFile);
            e.printStackTrace();
        }
    }

    @FXML void loadGoal1(ActionEvent event) { loadUI("PilotScheduling.fxml"); }
    @FXML void loadGoal2(ActionEvent event) { loadUI("FleetMaintenance.fxml"); }
    @FXML void loadGoal3(ActionEvent event) { loadUI("WeatherRisk.fxml"); }
    @FXML void loadGoal4(ActionEvent event) { loadUI("HelipadCoord.fxml"); }
    @FXML void loadGoal5(ActionEvent event) { loadUI("FuelAnalytics.fxml"); }

    @FXML void handleLogout(ActionEvent event) { /* Return to login screen */ }
}