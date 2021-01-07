package ch.azure.aurore.bookdb;

import ch.azure.aurore.ebooks.App;
import ch.azure.aurore.javaxt.fxml.Controller;

import java.net.URL;
import java.util.ResourceBundle;

public class BookSearchController extends Controller {

    public void click() {
        App.getInstance().switchScene(App.MAIN);
    }

    @Override
    protected void resume() {
    }

    @Override
    protected void start() {
    }

    @Override
    public void quit() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
