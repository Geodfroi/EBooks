package ch.azure.aurore.ebooks;

import ch.azure.aurore.fxml.FXApplication;
import javafx.fxml.FXMLLoader;

public class App extends FXApplication {

    public static void main(String[] args) {
        launch();
    }

    @Override
    protected FXMLLoader getLoader() {
        return new FXMLLoader(App.class.getResource("Main.fxml"));
    }
}
