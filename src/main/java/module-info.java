module EBooks {
    requires javafx.controls;
    requires javaxt;
    requires javafx.fxml;
    requires javafx.web;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;
    //requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    exports ch.azure.aurore.ebooks to javafx.graphics, javafx.fxml, com.fasterxml.jackson.databind;
    exports ch.azure.aurore.bookdb to com.fasterxml.jackson.databind, javafx.fxml, javafx.graphics;
    exports ch.azure.aurore.ebooks.data to javaxt;
    exports ch.azure.aurore.ebooks.main to javafx.fxml;

    opens ch.azure.aurore.bookdb to javafx.fxml;
}