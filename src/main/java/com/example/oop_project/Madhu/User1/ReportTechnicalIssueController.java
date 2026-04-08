package com.example.oop_project.Madhu.User1;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class ReportTechnicalIssueController
{
    @javafx.fxml.FXML
    private TextField helicopterIdTextField;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private ComboBox priorityComboBox;
    @javafx.fxml.FXML
    private TableColumn titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableView issueTableView;
    @javafx.fxml.FXML
    private TableColumn helicopterIDTextField;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn priorityTableColumn;
    @javafx.fxml.FXML
    private TextArea descriptionAreaTextField;

    ArrayList<ReportTechnicalIssue> reportTechnicalIssueList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logFlightHoursOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleNavTechnicalIssues(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleNavMaintenanceHistory(ActionEvent actionEvent) {
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