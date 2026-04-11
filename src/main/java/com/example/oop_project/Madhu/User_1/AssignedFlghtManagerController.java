package com.example.oop_project.Madhu.User_1;

import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AssignedFlghtManagerController
{
    @javafx.fxml.FXML
    private TableView flightTableView;
    @javafx.fxml.FXML
    private TableColumn departureTimeTableColumn;
    @javafx.fxml.FXML
    private ScrollPane mainScrollPane;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn helicopterIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn flightIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<> routetablecolumn;
    @javafx.fxml.FXML
    private TextField date;
    @javafx.fxml.FXML
    private TextField departureTime;
    @javafx.fxml.FXML
    private TextField helicopter;
    @javafx.fxml.FXML
    private TextField routee;
    @javafx.fxml.FXML
    private TextField flightID;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void saveButtonOnActions(ActionEvent actionEvent) {
    }
}