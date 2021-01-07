package ch.azure.aurore.ebooks.main;

import ch.azure.aurore.javaxt.fxml.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController extends Controller {
    @FXML
    public Menu fileMenu;
    //public WebView webView;

    private MenuHandler menuHandler;
    private ListViewHandler listViewHandler;
    private LibraryHandler libraryHandler;

    public LibraryHandler getLibraryHandler() {
        return libraryHandler;
    }

    public ListViewHandler getListViewHandler() {
        return listViewHandler;
    }

    @Override
    protected void resume() {
    }

    @Override
    public void start() {

    }

    @Override
    public void quit() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //   WebManager b = new WebManager(this);
        menuHandler = new MenuHandler(this);
        listViewHandler = new ListViewHandler(this);
        libraryHandler = new LibraryHandler(this);
    }

    public MenuHandler getMenuHandler() {
        return menuHandler;
    }

    public void setMenuHandler(MenuHandler menuHandler) {
        this.menuHandler = menuHandler;
    }
}