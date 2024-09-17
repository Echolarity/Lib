module com.lib.lib {

    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    opens com.lib.lib to javafx.fxml,spring.core,spring.boot,spring.context,spring.beans;
    exports com.lib.lib;
}