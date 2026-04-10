package com.example.oop_project;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoginController {
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
        String userId = userIdTextField.getText().trim();
        String password = passwordTextFieldField.getText().trim();

        if (userId.isEmpty() || password.isEmpty()) {
            CommonMethod.showError("Missing Info", "Please enter userId and password");
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

                    if (String.valueOf(user.getUserId()).equals(userId)
                            && user.getPassword().equals(password)) {

                        found = true;

                        switch (user.getRole()) {
                            case "Pilot":
                                CommonMethod.sceneChange(actionEvent, "Madhu/User_1/Dashboard.fxml");
                                break;
                            case "Client":
                                CommonMethod.sceneChange(actionEvent, "Madhu/User_2/Dashboard.fxml");
                                break;
                            case "Flight Operation Manager":
                                CommonMethod.showError("Role Error", "Page not added yet");
                                break;
                            case "Booking and Dispatch Officer":
                                CommonMethod.showError("Role Error", "Page not added yet");
                                break;
                            case "Maintenance Engineer":
                                CommonMethod.showError("Role Error", "Page not added yet");
                                break;
                            case "Fleet Manager":
                                CommonMethod.showError("Role Error", "Page not added yet");
                                break;
                            case "Customer support Officer":
                                CommonMethod.showError("Role Error", "Page not added yet");
                                break;
                            case "Scheduler":
                                CommonMethod.showError("Role Error", "Page not added yet");
                                break;
                            default:
                                CommonMethod.showError("Role Error", "Unknown role");
                        }

                        break;
                    }

                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();

            if (!found) {
                CommonMethod.showError("Login Failed", "Invalid userId or password");
            }

        } catch (Exception e) {
            e.printStackTrace();
            CommonMethod.showError("Error", "Login error: " + e.getMessage());
        }
    }
}