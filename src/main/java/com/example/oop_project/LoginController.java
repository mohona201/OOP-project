package com.example.oop_project;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoginController
{

    @javafx.fxml.FXML
    private PasswordField passwordTextFieldField;
    @javafx.fxml.FXML
    private TextField userIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountOnAction(ActionEvent actionEvent) {
        CommonMethod.sceneChange(actionEvent, "Register.fxml");
    }

    @javafx.fxml.FXML
    public void loginOnAction(ActionEvent actionEvent) {

        String userId = userIdTextField.getText();
        String password = passwordTextFieldField.getText();

        if (userId.isEmpty() || password.isEmpty()) {
            CommonMethod.showError("Missing Info", "Please enter username and password");
            return;
        }

        try {
            File file = new File("data/Register.bin");

            if (!file.exists() || file.length() == 0) {
                CommonMethod.showError("Error", "No registered user found");
                return;
            }

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean found = false;

            while (true) {
                try {
                    Register user = (Register) ois.readObject();

                    if (String.valueOf(user.getId()).equals(userId)
                            && user.getPassword().equals(password)) {

                        found = true;

                        switch (user.getRole()) {
                            case "Pilot":
                                CommonMethod.sceneChange(actionEvent, "Madhu/User 1/Dashboard.fxml");
                                break;
                            case "Client":
                                CommonMethod.sceneChange(actionEvent, "Madhu/User2/Dashboard.fxml");
                                break;
                            default:
                                CommonMethod.showError("Role Error", "Unknown role");
                        }

                        break;
                    }

                } catch (Exception eof) {
                    break;
                }
            }

            ois.close();

            if (!found) {
                CommonMethod.showError("Login Failed", "Invalid username or password");
            }

        } catch (Exception e) {
            CommonMethod.showError("Error", "Login error: " + e.getMessage());
        }

    }
}