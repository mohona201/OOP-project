module com.example.oop_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires com.example.oop_project;


    opens com.example.oop_project to javafx.fxml;
    exports com.example.oop_project;
}