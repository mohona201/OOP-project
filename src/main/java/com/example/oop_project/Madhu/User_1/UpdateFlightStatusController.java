package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class UpdateFlightStatusController {
    @javafx.fxml.FXML
    private ComboBox <String>statusComboBox;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableView <UpdateFlightStatus>flightTableView;
    @javafx.fxml.FXML
    private TableColumn <UpdateFlightStatus,String>routeTablecolumn;
    @javafx.fxml.FXML
    private TableColumn <UpdateFlightStatus,String>currentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UpdateFlightStatus, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <UpdateFlightStatus,String>flightIdTableColumn;

    @javafx.fxml.FXML
    private TextArea statusTextField;
    ArrayList<UpdateFlightStatus> updateFlightStatusList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Pending", "In Progress", "Completed", "Cancelled");

        routeTablecolumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, String>("route"));

        currentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, String>("currentStatus"));

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, LocalDate>("date"));

        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, String>("flightId"));


        CommonMethod.showTableDataFromBinFile("UpdateFlightStatus.bin", flightTableView);
        //CommonMethod.showTableDataFromBinFile("SubmitFlightReport.bin", reportTable);

    }


    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/MaintenanceHistory.fxml");
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/SubmitsFlightReport.fxml");

    }

    @javafx.fxml.FXML
    public void logBookOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/FlightComplete.fxml");
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/ReportTechnicalIssue.fxml");
    }

    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/FlightHistory.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/UpdateFlightStatus.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton1(ActionEvent actionEvent) {
        String newStatus = statusComboBox.getValue();
        String note = statusTextField.getText().trim();

        UpdateFlightStatus selectedFlight = flightTableView.getSelectionModel().getSelectedItem();

        if (selectedFlight == null) {
            CommonMethod.showError("Please select a flight");
            return;
        }

        if (newStatus == null || note.isEmpty()) {
            CommonMethod.showError("Please fill all fields");
            return;
        }
        selectedFlight.setCurrentStatus(newStatus);

        updateFlightStatusList.clear();
        updateFlightStatusList.addAll(flightTableView.getItems());

        CommonMethod.saveToBinFile("UpdateFlightStatus.bin", updateFlightStatusList);

        flightTableView.refresh();

        CommonMethod.showInformation("Success", "Status updated");

        statusComboBox.setValue(null);
        statusTextField.clear();
    }
}