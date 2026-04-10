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
        String flightId = flightIdTextField.getText().trim();
        String hoursText = flightHoursTextField.getText().trim();
        LocalDate date = datePicker.getValue();

        if (flightId.isEmpty() || hoursText.isEmpty() || date == null) {
            CommonMethod.showError("Please fill all fields");
            return;
        }

        if (!hoursText.matches("\\d+(\\.\\d+)?")) {
            CommonMethod.showError("hours will be number only)");
            return;
        }

        if (date.isAfter(LocalDate.now())) {
            CommonMethod.showError("Future date not allowed");
            return;
        }

        LogBook log = new LogBook(flightId, date, "", "", hoursText);

        logBookList.add(log);

        CommonMethod.saveToBinFile("LogBook.bin", logBookList);

        flightTableView.getItems().add(log);

        CommonMethod.showInformation("Success", "Log saved successfully");

        flightIdTextField.clear();
        flightHoursTextField.clear();
        datePicker.setValue(null);
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
    public void submitReportOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/SubmitsFlightReport.fxml");
    }

    @javafx.fxml.FXML
    public void logBookOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
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