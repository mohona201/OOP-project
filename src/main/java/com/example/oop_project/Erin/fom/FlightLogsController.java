package com.example.oop_project.Erin.fom;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.helicopter_service.Erin.models.Flight;

import java.util.List;

public class FlightLogsController {
    @FXML private TableView<Flight> logTable;
    @FXML private TableColumn<Flight, String> colId, colPassenger, colDest, colHeli, colStatus;

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("flightId"));
        colPassenger.setCellValueFactory(new PropertyValueFactory<>("passengerName"));
        colDest.setCellValueFactory(new PropertyValueFactory<>("destination"));
        colHeli.setCellValueFactory(new PropertyValueFactory<>("helicopterId"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        refreshLogs();
    }

    @FXML
    void refreshLogs() {
        List<Flight> data = FileManager.readObjectsFromFile("FlightData.bin");
        if (data != null) {
            logTable.setItems(FXCollections.observableArrayList(data));
        }
    }
}