module com.hodor.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.hodor.mazebank to javafx.fxml;
    exports com.hodor.mazebank;
    exports com.hodor.mazebank.controllers;
    exports com.hodor.mazebank.controllers.admin;
    exports com.hodor.mazebank.controllers.client;
    exports com.hodor.mazebank.models;
    exports com.hodor.mazebank.views;
}