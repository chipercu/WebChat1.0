module com.webchat.webchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.webchat.webchat to javafx.fxml;
    exports com.webchat.webchat;
}