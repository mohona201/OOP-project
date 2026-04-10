package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ReportTechnicalIssueController
{
    @javafx.fxml.FXML
    private TextField helicopterIdTextField;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private ComboBox <String>priorityComboBox;
    @javafx.fxml.FXML
    private TableColumn <ReportTechnicalIssue,String>titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn <ReportTechnicalIssue,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableView <ReportTechnicalIssue>issueTableView;
    @javafx.fxml.FXML
    private TableColumn <ReportTechnicalIssue,String>helicopterIDTextField;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <ReportTechnicalIssue,String>priorityTableColumn;
    @javafx.fxml.FXML
    private TextArea descriptionAreaTextField;

    ArrayList<ReportTechnicalIssue> reportTechnicalIssueList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        titleTableColumn.setCellValueFactory(new PropertyValueFactory<ReportTechnicalIssue, String>("title"));

        statusTableColumn.setCellValueFactory(new PropertyValueFactory<ReportTechnicalIssue, String>("status"));

        helicopterIDTextField.setCellValueFactory(new PropertyValueFactory<ReportTechnicalIssue, String>("helicopterID"));

        priorityTableColumn.setCellValueFactory(new PropertyValueFactory<ReportTechnicalIssue, String>("priority"));

        priorityComboBox.getItems().addAll("High", "Medium", "Low");

        CommonMethod.showTableDataFromBinFile("ReportTechnicalIssue.bin", issueTableView);
    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void logFlightHoursOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {

        String helicopterId = helicopterIdTextField.getText().trim();
        String title = titleTextField.getText().trim();
        String priority = priorityComboBox.getValue();
        String description = descriptionAreaTextField.getText().trim();

        if (helicopterId.isEmpty() || title.isEmpty() || priority == null || description.isEmpty()) {
            CommonMethod.showError("Please fill all fields");
            return;
        }


        ReportTechnicalIssue issue = new ReportTechnicalIssue(helicopterId, title, priority, "Pending");

        reportTechnicalIssueList.add(issue);

        CommonMethod.saveToBinFile("ReportTechnicalIssue.bin", reportTechnicalIssueList);

        issueTableView.getItems().add(issue);

        CommonMethod.showInformation("Success", "Report submitted");

        helicopterIdTextField.clear();
        titleTextField.clear();
        descriptionAreaTextField.clear();
        priorityComboBox.setValue(null);

    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/FlightComplete.fxml");
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
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/ReportTechnicalIssue.fxml");
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/MaintenanceHistory.fxml");
    }
}