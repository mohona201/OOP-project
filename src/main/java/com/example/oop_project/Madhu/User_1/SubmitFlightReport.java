package com.example.oop_project.Madhu.User_1;

import java.time.LocalDate;

public class SubmitFlightReport {
    public String flightId;
    public LocalDate flightDate;
    public String flightRoute;
    public String flightStatus;
    public String reportId;
    public String condition;
    public String flightSummary;

    public SubmitFlightReport(String flightId, LocalDate flightDate, String flightRoute, String flightStatus, String reportId, String condition, String flightSummary) {
        this.flightId = flightId;
        this.flightDate = flightDate;
        this.flightRoute = flightRoute;
        this.flightStatus = flightStatus;
        this.reportId = reportId;
        this.condition = condition;
        this.flightSummary = flightSummary;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getFlightSummary() {
        return flightSummary;
    }

    public void setFlightSummary(String flightSummary) {
        this.flightSummary = flightSummary;
    }

    @Override
    public String toString() {
        return "SubmitFlightReportModel{" +
                "flightId='" + flightId + '\'' +
                ", flightDate=" + flightDate +
                ", flightRoute='" + flightRoute + '\'' +
                ", flightStatus='" + flightStatus + '\'' +
                ", reportId='" + reportId + '\'' +
                ", condition='" + condition + '\'' +
                ", flightSummary='" + flightSummary + '\'' +
                '}';
    }
}
