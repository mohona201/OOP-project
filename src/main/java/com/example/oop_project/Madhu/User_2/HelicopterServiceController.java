package com.example.oop_project.Madhu.User_2;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class HelicopterServiceController {
    @javafx.fxml.FXML
    private TableView<HelicopterService> searchTable;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn<HelicopterService, String> helicopterIdTableColumn;
    @javafx.fxml.FXML
    private TextField typeTextField;
    @javafx.fxml.FXML
    private TextField routeTextField;
    @javafx.fxml.FXML
    private TableColumn<HelicopterService, String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HelicopterService, String> routeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HelicopterService, String> departureTimeTableColumn;
    @javafx.fxml.FXML
    private TextField flightIdTextField;
    @javafx.fxml.FXML
    private TableColumn<HelicopterService, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> helicopterTypeComboBox;

    ArrayList<HelicopterService> helicopterServiceList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("flightId"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        helicopterIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("helicopterId"));
        routeTableColumn.setCellValueFactory(new PropertyValueFactory<>("route"));
        departureTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("time"));

        helicopterTypeComboBox.getItems().addAll("All", "Light", "Medium", "Heavy");
        helicopterTypeComboBox.setValue("All");

        searchTable.getItems().clear();
        CommonMethod.showTableDataFromBinFile("AssignedFlightManager.bin", searchTable);

        helicopterServiceList.clear();
        helicopterServiceList.addAll(searchTable.getItems());
    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
        String flightId = flightIdTextField.getText().trim().toLowerCase();
        String helicopterId = typeTextField.getText().trim().toLowerCase();
        String route = routeTextField.getText().trim().toLowerCase();
        String helicopterType = helicopterTypeComboBox.getValue();

        searchTable.getItems().clear();

        for (HelicopterService h : helicopterServiceList) {
            if (
                    (flightId.isEmpty() || h.getFlightId().toLowerCase().contains(flightId)) &&
                            (helicopterId.isEmpty() || h.getHelicopterId().toLowerCase().contains(helicopterId)) &&
                            (route.isEmpty() || h.getRoute().toLowerCase().contains(route)) &&
                            (helicopterType == null || helicopterType.equals("All") || h.getHelicopterType().equalsIgnoreCase(helicopterType))
            ) {
                searchTable.getItems().add(h);
            }
        }
    }

    @javafx.fxml.FXML
    public void resetOnAction(ActionEvent actionEvent) {
        flightIdTextField.clear();
        typeTextField.clear();
        routeTextField.clear();
        helicopterTypeComboBox.setValue("All");

        searchTable.getItems().clear();
        CommonMethod.showTableDataFromBinFile("HelicopterService.bin", searchTable);

        helicopterServiceList.clear();
        helicopterServiceList.addAll(searchTable.getItems());
    }

    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/CancelsBooking.fxml");
    }

    @javafx.fxml.FXML
    public void paymentsOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/Payment.fxml");
    }

    @javafx.fxml.FXML
    public void bookFlightOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/BookHelicopter.fxml");
    }

    @javafx.fxml.FXML
    public void bookingHistoryOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/BookingHistory.fxml");
    }

    @javafx.fxml.FXML
    public void servicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void flightStatusOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/BookingStatus.fxml");
    }

    @javafx.fxml.FXML
    public void searchServicesOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/HelicopterServices.fxml");
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Login.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Madhu/User_2/Feedback.fxml");
    }
}