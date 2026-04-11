package com.example.oop_project.Erin.fom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.helicopter_service.Erin.models.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightDispatchController {
    @FXML private TableView<Flight> dispatchTable;
    @FXML private TableColumn<Flight, String> colId, colPassenger, colDest, colStatus;

    private final String FILE_NAME = "FlightData.bin";
    private ObservableList<Flight> flightList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("flightId"));
        colPassenger.setCellValueFactory(new PropertyValueFactory<>("passengerName"));
        colDest.setCellValueFactory(new PropertyValueFactory<>("destination"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadData();
    }

    private void loadData() {
        List<Flight> saved = FileManager.readObjectsFromFile(FILE_NAME);
        if (saved != null) {
            flightList.setAll(saved);
            dispatchTable.setItems(flightList);
        }
    }

    @FXML
    void dispatchFlight() {
        Flight selected = dispatchTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Dispatched");
            dispatchTable.refresh();
            FileManager.writeObjectsToFile(FILE_NAME, new ArrayList<>(flightList));
        }
    }

    @FXML
    void cancelFlight() {
        Flight selected = dispatchTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            flightList.remove(selected);
            FileManager.writeObjectsToFile(FILE_NAME, new ArrayList<>(flightList));
        }
    }
}