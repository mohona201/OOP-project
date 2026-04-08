package com.example.oop_project.Madhu.User1;

public class ReportTechinicalIssueModel {
    public String helicopterId;
    public String issueTitle;
    public String priority;
    public String issueStatus;

    public ReportTechinicalIssueModel(String helicopterId, String issueTitle, String priority, String issueStatus) {
        this.helicopterId = helicopterId;
        this.issueTitle = issueTitle;
        this.priority = priority;
        this.issueStatus = issueStatus;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    @Override
    public String toString() {
        return "ReportTechinicalIssueModel{" +
                "helicopterId='" + helicopterId + '\'' +
                ", issueTitle='" + issueTitle + '\'' +
                ", priority='" + priority + '\'' +
                ", issueStatus='" + issueStatus + '\'' +
                '}';
    }
}
