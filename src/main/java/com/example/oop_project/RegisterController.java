package com.example.oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController
{
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private ComboBox roleBox;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField emailField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private PasswordField confirmPasswordField;
    @javafx.fxml.FXML
    private Button btnBackToLogin;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnRegisterOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnBackToLoginOnAction(ActionEvent actionEvent) {
    }
}