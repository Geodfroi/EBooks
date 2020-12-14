module EBooks {
    requires javafx.controls;
    requires JavaExt;
    requires javafx.fxml;

    exports ch.azure.aurore.ebooks to javafx.graphics, javafx.fxml;
}