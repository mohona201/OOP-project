package com.example.oop_project.Madhu.User1;

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
    private TextArea remarksAreaTextField;

    ArrayList<UpdateFlightStatus> updateFlightStatusList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        routeTablecolumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, String>("route"));

        currentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, String>("currentStatus"));

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, LocalDate>("date"));

        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<UpdateFlightStatus, String>("flightId"));

        statusComboBox.getItems().addAll("Pending", "In Progress", "Completed", "Cancelled");

        CommonMethod.showTableDataFromBinFile("UpdateFlightStatus.bin", flightTableView);
    }


    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Login.fxml");
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Maintenance History .fxml");
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Submit Flight Report.fxml");

    }

    @javafx.fxml.FXML
    public void logBookOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Flight Complete .fxml");
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/ Report Technical.fxml");
    }

    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/ Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/ Flight History.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/ Update Flight Status.fxml");
    }
}