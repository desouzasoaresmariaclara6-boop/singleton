module com.senai.singleton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.singleton to javafx.fxml;
    exports com.senai.singleton;
}