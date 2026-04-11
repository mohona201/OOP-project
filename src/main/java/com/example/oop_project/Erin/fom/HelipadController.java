package com.example.oop_project.Erin.fom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.helicopter_service.Erin.models.Helipad;

import java.util.ArrayList;
import java.util.List;

public class HelipadController {
    @FXML private TableView<Helipad> helipadTable;
    @FXML private TableColumn<Helipad, String> colPadName;
    @FXML private TableColumn<Helipad, Boolean> colStatus;

    private final String FILE_NAME = "HelipadData.bin";
    private ObservableList<Helipad> padList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colPadName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("occupied"));

        // Load existing data
        List<Helipad> saved = FileManager.readObjectsFromFile(FILE_NAME);
        if (saved == null || saved.isEmpty()) {
            // Initial default data if no file exists
            padList.addAll(new Helipad("Pad Alpha", false), new Helipad("Pad Bravo", false));
        } else {
            padList.addAll(saved);
        }
        helipadTable.setItems(padList);
    }

    @FXML
    void toggleStatus() {
        Helipad selected = helipadTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            // Flip the boolean
            selected.setOccupied(!selected.isOccupied());

            // UI Refresh
            helipadTable.refresh();

            // BIN SAVE: Convert ObservableList to a standard ArrayList to save
            FileManager.writeObjectsToFile(FILE_NAME, new ArrayList<>(padList));
        }
    }
}