package com.example.oop_project.Madhu.User1;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class FlightHistoryController {
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <FlightHistory,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn <FlightHistory,String>routetableColumn;
    @javafx.fxml.FXML
    private TableColumn <FlightHistory, LocalTime>hourstableColumn;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn <FlightHistory, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableView <FlightHistory>flightHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn <FlightHistory,String>flightIdTableColumn;

    ArrayList<FlightHistory> flightHistoryList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void handleNavTechnicalIssues(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterOnActionButton(ActionEvent actionEvent) {
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
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
    }
}