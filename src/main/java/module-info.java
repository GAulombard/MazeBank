module com.hodor.mazebank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hodor.mazebank to javafx.fxml;
    exports com.hodor.mazebank;
}