package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.oop_project.Madhu.User_1.Dashboard;

import java.time.LocalDate;
import java.util.ArrayList;

public class DashboardClientController
{
    @javafx.fxml.FXML
    private TableView<Dashboard> serviceTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn<Dashboard, String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Dashboard, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Dashboard, String> helicopterIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Dashboard, String> routeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Dashboard, String> departureTimeTableColumn;

    ArrayList<Dashboard> dashboardList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("flightId"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, LocalDate>("flightDate"));
        helicopterIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("helicopterId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("flightRoute"));
        departureTimeTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("departureTime"));

        serviceTable.getItems().clear();
        CommonMethod.showTableDataFromBinFile("AssignedFlightManager.bin", serviceTable);

        dashboardList.clear();
        dashboardList.addAll(serviceTable.getItems());
    }

    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/CancelsBooking.fxml");
    }

    @javafx.fxml.FXML
    public void paymentsOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Payment.fxml");
    }

    @javafx.fxml.FXML
    public void bookFlightOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookHelicopter.fxml");
    }

    @javafx.fxml.FXML
    public void bookingHistoryOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookingHistory.fxml");
    }

    @javafx.fxml.FXML
    public void servicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightStatusOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/BookingStatus.fxml");
    }

    @javafx.fxml.FXML
    public void searchServicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/HelicopterServices.fxml");
    }

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
        serviceTable.getItems().clear();
        CommonMethod.showTableDataFromBinFile("AssignedFlightManager.bin", serviceTable);

        dashboardList.clear();
        dashboardList.addAll(serviceTable.getItems());
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent,"Madhu/User_2/Feedback.fxml");
    }
}