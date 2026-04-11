package com.example.oop_project.Erin.fom;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.helicopter_service.Erin.models.Flight;

import java.util.List;

public class EmergencyDispatchController {
    @FXML private ComboBox<String> flightSelector;
    @FXML private TextArea incidentArea;
    @FXML private Label alertLabel;

    private final String FILE_NAME = "FlightData.bin";

    @FXML
    public void initialize() {
        List<Flight> flights = FileManager.readObjectsFromFile(FILE_NAME);
        if (flights != null) {
            for (Flight f : flights) {
                flightSelector.getItems().add(f.getFlightId());
            }
        }
    }

    @FXML
    void handleEmergency() {
        String selectedId = flightSelector.getValue();
        if (selectedId == null || incidentArea.getText().isEmpty()) return;

        List<Flight> flights = FileManager.readObjectsFromFile(FILE_NAME);
        for (Flight f : flights) {
            if (f.getFlightId().equals(selectedId)) {
                f.setStatus("⚠ EMERGENCY");
                break;
            }
        }

        FileManager.writeObjectsToFile(FILE_NAME, flights);
        alertLabel.setText("EMERGENCY BROADCAST SENT FOR " + selectedId);
    }
}