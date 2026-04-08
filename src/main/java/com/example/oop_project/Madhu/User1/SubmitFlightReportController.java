package com.example.oop_project.Madhu.User1;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.time.LocalDate;
import java.util.ArrayList;

public class SubmitFlightReportController {
    @javafx.fxml.FXML
    private TableView <SubmitFlightReport>reportTable;
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private ComboBox <String>conditionComboBox;
    @javafx.fxml.FXML
    private TableColumn <SubmitFlightReport,String>routeTableColumn;
    @javafx.fxml.FXML
    private TableColumn <SubmitFlightReport, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <SubmitFlightReport,String>flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <SubmitFlightReport,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableView <SubmitFlightReport>flightTableView;
    @javafx.fxml.FXML
    private TextArea summaryAreatextField;
    @javafx.fxml.FXML
    private TextField flightidTextField;

    ArrayList<SubmitFlightReport> submitFlightReportList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSubmitReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logFlightHoursOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
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