package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class DashboardClientController
{
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> availabilityTableColumn;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableView <Dashboard>serviceTable;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,String> serviceIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer> priceTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Dashboard,Integer>flightIdTableColumn;

    ArrayList<Dashboard> dashboards= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("capacity"));
        availabilityTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("flightAvailability"));
       // serviceNameTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("serviceName"));
      //  helicopterTypeTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("helicopterType"));
        serviceIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, String>("serviceId"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard, Integer>("flightPrice"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard,LocalDate>("date"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<Dashboard,Integer>("flightId"));

        CommonMethod.showTableDataFromBinFile("Dashboard.bin", serviceTable);
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