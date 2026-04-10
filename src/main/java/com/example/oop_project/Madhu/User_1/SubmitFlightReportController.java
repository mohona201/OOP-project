package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

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

        routeTableColumn.setCellValueFactory(new PropertyValueFactory<SubmitFlightReport, String>("route"));

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<SubmitFlightReport, LocalDate>("date"));

        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<SubmitFlightReport, String>("flightId"));

        statusTableColumn.setCellValueFactory(new PropertyValueFactory<SubmitFlightReport, String>("status"));

        conditionComboBox.getItems().addAll("Good", "Average", "Poor");

        CommonMethod.showTableDataFromBinFile("SubmitFlightReport.bin", flightTableView);
    }

    @javafx.fxml.FXML
    public void handleSubmitReport(ActionEvent actionEvent) {
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
    public void logFlightHoursOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/SubmitsFlightReport.fxml");
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
}