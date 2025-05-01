module com.node_modules.cofeshop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.node_modules.cofeshop to javafx.fxml;
    exports com.node_modules.cofeshop;
}
