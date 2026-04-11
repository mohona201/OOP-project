package com.example.oop_project.Erin.fom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.helicopter_service.Erin.models.Pilot;

import java.util.List;

public class PilotSchedulingController {
    // These MUST match the fx:id in your FXML exactly
    @FXML private TextField nameField;
    @FXML private TextField idField;
    @FXML private ComboBox<String> shiftBox;
    @FXML private TableView<Pilot> pilotTable;
    @FXML private TableColumn<Pilot, String> colName;
    @FXML private TableColumn<Pilot, String> colId;
    @FXML private TableColumn<Pilot, String> colShift;

    private final String FILE_PATH = "PilotsData.bin";
    private ObservableList<Pilot> pilotList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // 1. Link TableColumns to Pilot class getters (getName, getLicenseId, etc.)
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colId.setCellValueFactory(new PropertyValueFactory<>("licenseId"));
        colShift.setCellValueFactory(new PropertyValueFactory<>("shift"));

        // 2. Setup ComboBox options
        shiftBox.getItems().addAll("Morning (06:00-14:00)", "Evening (14:00-22:00)", "Night Shift");

        // 3. Load existing data from the BIN file
        List<Pilot> savedData = FileManager.readObjectsFromFile(FILE_PATH);
        if (savedData != null) {
            pilotList.addAll(savedData);
        }
        pilotTable.setItems(pilotList);
    }

    @FXML
    void savePilot(ActionEvent event) {
        String name = nameField.getText();
        String id = idField.getText();
        String shift = shiftBox.getValue();

        if (name.isEmpty() || id.isEmpty() || shift == null) {
            System.out.println("Error: Please fill all fields.");
            return;
        }

        // Create new pilot and update UI
        Pilot newPilot = new Pilot(name, id, shift);
        pilotList.add(newPilot);

        // Save to Binary File
        FileManager.writeObjectsToFile(FILE_PATH, pilotList);

        // Clear input fields
        nameField.clear();
        idField.clear();
        shiftBox.setValue(null);
    }
}