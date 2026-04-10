package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaintenanceHistoryController {
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceHistory,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableView <MaintenanceHistory>maintenanceTableView;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceHistory,String>maintenanceIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceHistory,String>issueDescriptionTableColumn;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceHistory, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceHistory,String>helicopterIdTableColumn;

    ArrayList<MaintenanceHistory>maintenanceHistoryList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        statusTableColumn.setCellValueFactory(new PropertyValueFactory<MaintenanceHistory, String>("status"));

        maintenanceIdTableColumn.setCellValueFactory(new PropertyValueFactory<MaintenanceHistory, String>("maintenanceId"));

        issueDescriptionTableColumn.setCellValueFactory(new PropertyValueFactory<MaintenanceHistory, String>("issueDescription"));

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<MaintenanceHistory, LocalDate>("date"));

        helicopterIdTableColumn.setCellValueFactory(new PropertyValueFactory<MaintenanceHistory, String>("helicopterId"));

        CommonMethod.showTableDataFromBinFile("MaintenanceHistory.bin", maintenanceTableView);

    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Login .fxml");
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Maintenance History .fxml");
    }

    @javafx.fxml.FXML
    public void searchOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Submit Flight Report.fxml");
    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Flight Complete .fxml");
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Report Technical.fxml");
    }

    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void refreshOnActionButton(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void logBookOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Update Flight Status.fxml");
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Flight History.fxml");
    }
}