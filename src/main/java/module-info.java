module com.node_modules.cofeshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    
    opens com.node_modules.cofeshop to javafx.fxml;
    exports com.node_modules.cofeshop;
}
