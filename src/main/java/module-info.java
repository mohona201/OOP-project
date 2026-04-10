module com.example.oop_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.example.oop_project to javafx.fxml;
    opens com.example.oop_project.Madhu.User_1 to javafx.fxml;
    opens com.example.oop_project.Madhu.User_2 to javafx.fxml;

    exports com.example.oop_project;
    exports com.example.oop_project.Madhu.User_1;
    exports com.example.oop_project.Madhu.User_2;
}