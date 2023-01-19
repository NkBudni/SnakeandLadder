module com.example.nitinsl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nitinsl to javafx.fxml;
    exports com.example.nitinsl;
}