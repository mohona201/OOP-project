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
    private TableColumn<AssignedFlightManager, Integer> helicopterIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AssignedFlightManager, Integer> flightIdTableColumn;
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
        departureTimeTableColumn.setCellValueFactory(new PropertyValueFactory<AssignedFlightManager, String>("departureTime"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<AssignedFlightManager, LocalDate>("date"));
        helicopterIdTableColumn.setCellValueFactory(new PropertyValueFactory<AssignedFlightManager, Integer>("helicopterId"));
        flightIdTableColumn.setCellValueFactory(new PropertyValueFactory<AssignedFlightManager, Integer>("flightId"));
        routetablecolumn.setCellValueFactory(new PropertyValueFactory<AssignedFlightManager, String>("route"));

        flightTableView.getItems().clear();
        CommonMethod.showTableDataFromBinFile("AssignedFlightManager.bin", flightTableView);

        assignedFlightManagerList.clear();
        assignedFlightManagerList.addAll(flightTableView.getItems());
    }
    @javafx.fxml.FXML
    public void refreshOnActionButton(ActionEvent actionEvent) {
        flightIDTextField.clear();
        datePicker.clear();
        helicopterTextField.clear();
        routeTextField.clear();
        departureTimeTextField.clear();

        flightTableView.getItems().clear();
        CommonMethod.showTableDataFromBinFile("AssignedFlightManager.bin", flightTableView);

        assignedFlightManagerList.clear();
        assignedFlightManagerList.addAll(flightTableView.getItems());
    }
}