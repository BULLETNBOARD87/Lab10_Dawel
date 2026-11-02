module com.mycompany.lab10menu_dawel {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab10menu_dawel to javafx.fxml;
    exports com.mycompany.lab10menu_dawel;
}
