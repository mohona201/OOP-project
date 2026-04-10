package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class FlightHistoryController {
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn<FlightHistory, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<FlightHistory, String> routetableColumn;
    @javafx.fxml.FXML
    private TableColumn<FlightHistory, LocalTime> hourstableColumn;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<FlightHistory, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableView<FlightHistory> flightHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn<FlightHistory, String> flightIdTableColumn;

    ArrayList<FlightHistory> flightHistoryList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<FlightHistory,String>("status"));
        routetableColumn.setCellValueFactory(new PropertyValueFactory<FlightHistory,String>("route"));
        hourstableColumn.setCellValueFactory(new PropertyValueFactory<FlightHistory,LocalTime>("hours"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<FlightHistory,LocalDate>("date"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<FlightHistory,String>("flightId"));

        CommonMethod.showTableDataFromBinFile("FlightHistory.bin", flightHistoryTableView);
    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Login.fxml");
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Maintenance History.fxml");
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Submit Flight Report.fxml");
    }

    @javafx.fxml.FXML
    public void logBookOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Flight Complete.fxml");
    }

    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void refreshOnActionButton(ActionEvent actionEvent) {
        flightHistoryTableView.getItems().clear();
        CommonMethod.showTableDataFromBinFile("FlightHistory.bin", flightHistoryTableView);
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Flight History.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Update Flight Status.fxml");
    }

    @javafx.fxml.FXML
    public void filterOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Report Technical.fxml");
    }
}