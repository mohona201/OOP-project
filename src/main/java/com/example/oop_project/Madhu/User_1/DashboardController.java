package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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

        statusTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("status"));

        departureTimeTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, LocalTime>("departureTime"));

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, LocalDate>("date"));

        helicopterIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("helicopterId"));

        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("flightId"));

        routetablecolumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("route"));

        CommonMethod.showTableDataFromBinFile("Dashboard.bin", flightTableView);

    }

    @javafx.fxml.FXML
    public void searchOnActionButton(ActionEvent actionEvent) {

        String searchText = searchTextField.getText().trim();

        if (searchText.isEmpty()) {
            CommonMethod.showError("please enter Flight ID or Route");
            return;
        }

        ArrayList<Dashboard> dashboardList = new ArrayList<>();

        for (Dashboard a : flightTableView.getItems()) {

            if (a.getFlightId().equalsIgnoreCase(searchText)
                    || a.getRoute().equalsIgnoreCase(searchText)) {

                dashboardList.add(a);
            }
        }

        flightTableView.getItems().clear();

        if (dashboardList.isEmpty()) {
            CommonMethod.showError("Please fill the field");
            return;
        }

        flightTableView.getItems().addAll(dashboardList);
    }


    @javafx.fxml.FXML
    public void assignedFlightsOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/Dashboard.fxml");

    }

    @javafx.fxml.FXML
    public void refreshOnActionButton(ActionEvent actionEvent) {

        searchTextField.clear();
        flightTableView.getItems().clear();
        CommonMethod.showTableDataFromBinFile("AssignedFlight.bin", flightTableView);

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
    public void completeFlightOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/FlightComplete.fxml");
    }

    @javafx.fxml.FXML
    public void technicalIssuesOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/ReportTechnicalIssue.fxml");
    }

    @javafx.fxml.FXML
    public void flightHistoryOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/FlightHistory.fxml");
    }

    @javafx.fxml.FXML
    public void logbookOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/LogBook.fxml");
    }

    @javafx.fxml.FXML
    public void updateStatusOnActionButton(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_1/UpdateFlightStatus.fxml");
    }
}