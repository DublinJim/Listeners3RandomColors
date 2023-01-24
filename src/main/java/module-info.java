module com.example.listeners3randomcolors {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listeners3randomcolors to javafx.fxml;
    exports com.example.listeners3randomcolors;
}