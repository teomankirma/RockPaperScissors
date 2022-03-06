module com.example.rockpaperscissors {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rockpaperscissors to javafx.fxml;
    exports com.example.rockpaperscissors;
}