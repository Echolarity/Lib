module com.lib.lib {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lib.lib to javafx.fxml;
    exports com.lib.lib;
}