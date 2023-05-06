module com.example.swichdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swichdemo to javafx.fxml;
    exports com.example.swichdemo;
}