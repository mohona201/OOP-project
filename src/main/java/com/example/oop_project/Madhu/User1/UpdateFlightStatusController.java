package com.example.oop_project.Madhu.User1;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

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
    }


    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logBookOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
    }
}