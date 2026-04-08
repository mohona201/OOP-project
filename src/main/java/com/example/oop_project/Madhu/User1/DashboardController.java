package com.example.oop_project.Madhu.User1;

import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DashboardController
{
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableView <Dashboard>flightTableView;
    @javafx.fxml.FXML
    private TableColumn <Dashboard, LocalTime>departureTimeTableColumn;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableColumn <Dashboard, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer>helicopterIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer>flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String>routetablecolumn;

    ArrayList<Dashboard>dashboardList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void searchOnActionButton(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOnActionButton(ActionEvent actionEvent) {
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
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logbookOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
    }
}