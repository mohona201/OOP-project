package com.example.oop_project.Erin.fom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.helicopter_service.Erin.models.Flight;

import java.util.List;

public class FlightScheduleController {
    @FXML private TableView<Flight> scheduleTable;
    @FXML private TableColumn<Flight, String> colId, colTime, colDest, colStatus;
    @FXML private TextField searchField;

    private ObservableList<Flight> masterData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("flightId"));
        colDest.setCellValueFactory(new PropertyValueFactory<>("destination"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        // Note: You may need to add a 'time' field to your Flight model for colTime

        loadData();
    }

    private void loadData() {
        List<Flight> saved = FileManager.readObjectsFromFile("FlightData.bin");
        if (saved != null) {
            masterData.setAll(saved);

            // Set up search/filter logic
            FilteredList<Flight> filteredData = new FilteredList<>(masterData, p -> true);
            searchField.textProperty().addListener((obs, oldVal, newVal) -> {
                filteredData.setPredicate(flight -> {
                    if (newVal == null || newVal.isEmpty()) return true;
                    String lowerCaseFilter = newVal.toLowerCase();
                    return flight.getFlightId().toLowerCase().contains(lowerCaseFilter) ||
                            flight.getDestination().toLowerCase().contains(lowerCaseFilter);
                });
            });
            scheduleTable.setItems(filteredData);
        }
    }

    @FXML
    void handleFilter() {
        // Handled by the listener above, but kept for the FXML button link
    }
}