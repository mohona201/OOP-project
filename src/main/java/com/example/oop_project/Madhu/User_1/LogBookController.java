package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;


public class LogBookController {
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn <LogBook,String>routetableColumn;
    @javafx.fxml.FXML
    private TableView <LogBook>flightTableView;
    @javafx.fxml.FXML
    private TableColumn <LogBook,String>statustableColumn;
    @javafx.fxml.FXML
    private TextField flightIdTextField;
    @javafx.fxml.FXML
    private TextField flightHoursTextField;
    @javafx.fxml.FXML
    private TableColumn <LogBook, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <LogBook,String>flightIdTableColumn;

    ArrayList<LogBook> logBookList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {


        routetableColumn.setCellValueFactory(new PropertyValueFactory<LogBook, String>("route"));

        statustableColumn.setCellValueFactory(new PropertyValueFactory<LogBook, String>("status"));

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<LogBook, LocalDate>("date"));

        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<LogBook, String>("flightId"));

        CommonMethod.showTableDataFromBinFile("LogBook.bin", flightTableView);
    }

    @javafx.fxml.FXML
    public void saveLogOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Login .fxml");
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Maintenance History .fxml");
    }

    @javafx.fxml.FXML
    public void submitReportOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Submit Flight Report.fxml");
    }

    @javafx.fxml.FXML
    public void logBookOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Flight Complete .fxml");
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/ Report Technical.fxml");
    }

    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/ Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/ Flight History.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/ Update Flight Status.fxml");
    }
}