package com.example.oop_project.Madhu.User1;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class FlightCompleteController {
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <MarkFlightAsComplete,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableView<MarkFlightAsComplete> flightTableView;
    @javafx.fxml.FXML
    private TextArea notesTextField;
    @javafx.fxml.FXML
    private TableColumn <MarkFlightAsComplete,String>routeTableColumn;
    @javafx.fxml.FXML
    private TextArea flightIdTextField;
    @javafx.fxml.FXML
    private TableColumn <MarkFlightAsComplete, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <MarkFlightAsComplete,String>flightIdTableColumn;

    ArrayList<MarkFlightAsComplete> markFlightAsCompleteList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {


        statusTableColumn.setCellValueFactory(new PropertyValueFactory<MarkFlightAsComplete, String>("status"));

        routeTableColumn.setCellValueFactory(new PropertyValueFactory<MarkFlightAsComplete, String>("route"));

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<MarkFlightAsComplete, LocalDate>("date"));

        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<MarkFlightAsComplete, String>("flightId"));

        CommonMethod.showTableDataFromBinFile("MarkFlightAsComplete.bin", flightTableView);
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Maintenance History .fxml");
    }

    @javafx.fxml.FXML
    public void logoutOnactionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User 1/Login .fxml");
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

    @javafx.fxml.FXML
    public void markCompleteOnActionButton(ActionEvent actionEvent) {
    }
}