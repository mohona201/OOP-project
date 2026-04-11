package com.example.oop_project.Erin.fom;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FeedbackController {

    @FXML private TextField passengerNameField;
    @FXML private TextField flightIdField;
    @FXML private TextArea feedbackTextArea;

    /**
     * Called when the 'Submit' button is clicked in the FXML.
     * Ensure the button in FXML has onAction="#handleSubmitFeedback"
     */
    @FXML
    private void handleSubmitFeedback() {
        String name = passengerNameField.getText();
        String flightId = flightIdField.getText();
        String feedback = feedbackTextArea.getText();

        if (name.isEmpty() || feedback.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Form Error!", "Please fill in all required fields.");
            return;
        }

        // Logic to save feedback (Example: Writing to a text file)
        saveFeedbackToFile(name, flightId, feedback);

        showAlert(Alert.AlertType.INFORMATION, "Success!", "Thank you for your feedback, " + name + "!");
        clearFields();
    }

    private void saveFeedbackToFile(String name, String id, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("passenger_feedback.txt", true))) {
            writer.write("Passenger: " + name + " | Flight: " + id);
            writer.newLine();
            writer.write("Feedback: " + text);
            writer.newLine();
            writer.write("------------------------------");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        passengerNameField.clear();
        flightIdField.clear();
        feedbackTextArea.clear();
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}