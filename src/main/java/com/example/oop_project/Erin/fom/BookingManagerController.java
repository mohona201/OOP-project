package com.example.oop_project.Erin.fom;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.helicopter_service.Erin.models.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookingManagerController {
    @FXML private TextField nameField, destField, heliField;
    @FXML private Label statusLabel;

    private final String FILE_NAME = "FlightData.bin";

    @FXML
    void saveBooking() {
        if (nameField.getText().isEmpty() || destField.getText().isEmpty()) {
            statusLabel.setText("Error: Please fill all fields.");
            return;
        }

        // Generate ID and create object
        String id = "FL-" + (1000 + new Random().nextInt(9000));
        Flight newFlight = new Flight(id, nameField.getText(), destField.getText(), heliField.getText(), "Pending");

        // Load existing, add new, and save back
        List<Flight> currentList = FileManager.readObjectsFromFile(FILE_NAME);
        if (currentList == null) currentList = new ArrayList<>();

        currentList.add(newFlight);
        FileManager.writeObjectsToFile(FILE_NAME, currentList);

        statusLabel.setText("Success! Flight " + id + " booked.");
        nameField.clear(); destField.clear(); heliField.clear();
    }
}