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
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Login .fxml");
    }

    @javafx.fxml.FXML
    public void logFlightHoursOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
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
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Flight History.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Update Flight Status.fxml");
    }


    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Report Technical.fxml");
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Maintenance History .fxml");
    }
}