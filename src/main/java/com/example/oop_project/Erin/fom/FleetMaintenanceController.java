package com.example.oop_project.Erin.fom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.helicopter_service.Erin.models.MaintenanceRecord;

import java.util.List;

public class FleetMaintenanceController {

    @FXML private TableView<MaintenanceRecord> maintenanceTable;
    @FXML private TableColumn<MaintenanceRecord, String> colHeliId;
    @FXML private TableColumn<MaintenanceRecord, String> colStatus;
    @FXML private TableColumn<MaintenanceRecord, String> colDate;

    @FXML private TextField heliIdField;
    @FXML private TextField dateField;
    @FXML private ComboBox<String> statusCombo;

    private final String FILE_NAME = "MaintenanceData.bin";
    private ObservableList<MaintenanceRecord> recordList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set up table columns to match MaintenanceRecord getters
        colHeliId.setCellValueFactory(new PropertyValueFactory<>("helicopterId"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("lastServiceDate"));

        statusCombo.getItems().addAll("Operational", "Under Repair", "Awaiting Parts", "Grounded");

        // Load existing data from the BIN file
        List<MaintenanceRecord> saved = FileManager.readObjectsFromFile(FILE_NAME);
        if (saved != null) {
            recordList.addAll(saved);
        }
        maintenanceTable.setItems(recordList);
    }

    @FXML
    void handleAddRecord(ActionEvent event) {
        String id = heliIdField.getText();
        String status = statusCombo.getValue();
        String date = dateField.getText();

        if (id.isEmpty() || status == null) {
            System.out.println("Error: Helicopter ID and Status are required.");
            return;
        }

        MaintenanceRecord newRecord = new MaintenanceRecord(id, status, date);
        recordList.add(newRecord);

        // Save the updated list to the BIN file
        FileManager.writeObjectsToFile(FILE_NAME, recordList);

        // Clear fields
        heliIdField.clear();
        dateField.clear();
        statusCombo.setValue(null);
    }
}