package com.example.oop_project.Erin.fom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.helicopter_service.Erin.models.FuelLog;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FuelController {
    @FXML private TextField fuelHeliId, fuelAmount;
    @FXML private TextArea fuelLogArea;

    private final String FILE_NAME = "FuelData.bin";

    @FXML
    public void initialize() {
        refreshLogArea();
    }

    @FXML
    void handleLogFuel(ActionEvent event) {
        try {
            String id = fuelHeliId.getText();
            double amount = Double.parseDouble(fuelAmount.getText());
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

            // Load, Update, and Save
            List<FuelLog> logs = FileManager.readObjectsFromFile(FILE_NAME);
            logs.add(new FuelLog(id, amount, time));
            FileManager.writeObjectsToFile(FILE_NAME, logs);

            refreshLogArea();
            fuelHeliId.clear();
            fuelAmount.clear();
        } catch (NumberFormatException e) {
            System.out.println("Invalid fuel amount entered.");
        }
    }

    private void refreshLogArea() {
        List<FuelLog> logs = FileManager.readObjectsFromFile(FILE_NAME);
        StringBuilder sb = new StringBuilder("--- FUELING LOGS ---\n");
        for (FuelLog log : logs) {
            sb.append(String.format("[%s] Heli: %s | Added: %.1f L\n",
                    log.getTimestamp(), log.getHelicopterId(), log.getLitersAdded()));
        }
        fuelLogArea.setText(sb.toString());
    }
}