package com.example.oop_project.Madhu.User_1;

import com.example.oop_project.CommonMethod;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class AssignedFlightManagerController
{
    @javafx.fxml.FXML
    private TableView<AssignedFlightManager> flightTableView;
    @javafx.fxml.FXML
    private TableColumn<AssignedFlightManager, String> departureTimeTableColumn;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn<AssignedFlightManager, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignedFlightManager, String> helicopterIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignedFlightManager, String> flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignedFlightManager, String> routetablecolumn;
    @javafx.fxml.FXML
    private TextField routeTextField;
    @javafx.fxml.FXML
    private TextField departureTimeTextField;
    @javafx.fxml.FXML
    private TextField flightIDTextField;
    @javafx.fxml.FXML
    private TextField datePicker;
    @javafx.fxml.FXML
    private TextField helicopterTextField;

    ArrayList<AssignedFlightManager> assignedFlightManagerList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        departureTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("departureTime"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        helicopterIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("helicopterID"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("flightID"));
        routetablecolumn.setCellValueFactory(new PropertyValueFactory<>("flightRoute"));

        flightTableView.getItems().clear();
        CommonMethod.showTableDataFromBinFile("AssignedFlightManager.bin", flightTableView);

        assignedFlightManagerList.clear();
        assignedFlightManagerList.addAll(flightTableView.getItems());
    }

    @javafx.fxml.FXML
    public void saveOnActionButton(ActionEvent actionEvent) {

        String flightId = flightIDTextField.getText().trim();
        String helicopterId = helicopterTextField.getText().trim();
        String dateText = datePicker.getText().trim();
        String route = routeTextField.getText().trim();
        String departureTime = departureTimeTextField.getText().trim();

        if (flightId.isEmpty() || helicopterId.isEmpty() || dateText.isEmpty()
                || route.isEmpty() || departureTime.isEmpty()) {
            CommonMethod.showError("Missing Info", "Please fill all fields");
            return;
        }

        if (!flightId.matches("\\d+") || !helicopterId.matches("\\d+")) {
            CommonMethod.showError("Invalid Input", "Flight ID and Helicopter ID must be numeric.");
            return;
        }

        LocalDate date = LocalDate.parse(dateText);

        AssignedFlightManager assignedFlight = new AssignedFlightManager(flightId, helicopterId, date, route, departureTime);

        assignedFlightManagerList = new ArrayList<>();
        assignedFlightManagerList.add(assignedFlight);

        CommonMethod.saveToBinFile("AssignedFlightManager.bin", assignedFlightManagerList);

        flightTableView.getItems().add(assignedFlight);
        CommonMethod.showConfirmation("Success", "Saved Successfully");

        flightIDTextField.clear();
        helicopterTextField.clear();
        datePicker.clear();
        routeTextField.clear();
        departureTimeTextField.clear();


    }
}