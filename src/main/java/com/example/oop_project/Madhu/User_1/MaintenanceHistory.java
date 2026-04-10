package com.example.oop_project.Madhu.User_1;

import java.time.LocalDate;

public class MaintenanceHistory {
    public String maintenanceId;
    public String helicopterId;
    public LocalDate maintenanceDate;
    public String issueDescription;
    public String maintenanceStatus;

    public MaintenanceHistory(String maintenanceId, String helicopterId, LocalDate maintenanceDate, String issueDescription, String maintenanceStatus) {
        this.maintenanceId = maintenanceId;
        this.helicopterId = helicopterId;
        this.maintenanceDate = maintenanceDate;
        this.issueDescription = issueDescription;
        this.maintenanceStatus = maintenanceStatus;
    }

    public String getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(String maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    @Override
    public String toString() {
        return "MaintenanceHistoryModel{" +
                "maintenanceId='" + maintenanceId + '\'' +
                ", helicopterId='" + helicopterId + '\'' +
                ", maintenanceDate=" + maintenanceDate +
                ", issueDescription='" + issueDescription + '\'' +
                ", maintenanceStatus='" + maintenanceStatus + '\'' +
                '}';
    }
}
