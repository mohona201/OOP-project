package com.example.oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class RegisterController
{
    @javafx.fxml.FXML
    private Button btnBackToLogin;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private PasswordField confirmPasswordTextField;
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;

    ArrayList<Register> registerList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        roleComboBox.getItems().addAll(
                "Pilot",
                "Client",
                "Flight Operation Manager",
                "Booking and Dispatch Officer",
                "Maintenance Engineer",
                "Fleet Manager",
                "Customer support Officer",
                "Scheduler"
        );
    }

    @javafx.fxml.FXML
    public void backToLoginOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Login.fxml");
    }

    @javafx.fxml.FXML
    public void registerOnAction(ActionEvent actionEvent) {
        String id = userIdTextField.getText();
        String email = emailTextField.getText();
        String name = nameTextField.getText();
        String password = passwordTextField.getText();
        String confirmPassword = confirmPasswordTextField.getText();
        String role = roleComboBox.getValue();

        registerList = new ArrayList<>();

        if (id.isEmpty() || email.isEmpty() || name.isEmpty()
                || role == null || role.isEmpty()
                || password.isEmpty() || confirmPassword.isEmpty()) {

            CommonMethod.showError("Information Missing",
                    "Please fill in all fields.");
            return;
        }

        if (!email.contains("@")) {
            CommonMethod.showError("Invalid Email",
                    "Please enter a valid email.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            CommonMethod.showError("Password Mismatch",
                    "Password and Confirm Password do not match.");
            return;
        }

        int idTxt = Integer.parseInt(userIdTextField.getText());

        registerList.add(new Register(idTxt, email, name, password, role));
        CommonMethod.saveToBinFile("Register.bin", registerList);

        CommonMethod.showConfirmation("Success",
                "User registered successfully!\nPress login and enter your username and password.");

        userIdTextField.clear();
        emailTextField.clear();
        nameTextField.clear();
        passwordTextField.clear();
        confirmPasswordTextField.clear();
        roleComboBox.setValue(null);
    }
}