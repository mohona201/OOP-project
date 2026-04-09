module com.example.oop_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.example.oop_project to javafx.fxml;
    opens com.example.oop_project.Madhu.User1 to javafx.fxml;
    opens com.example.oop_project.Madhu.User2 to javafx.fxml;

    exports com.example.oop_project;
    exports com.example.oop_project.Madhu.User1;
    exports com.example.oop_project.Madhu.User2;
}