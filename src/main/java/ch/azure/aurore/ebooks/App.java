package ch.azure.aurore.ebooks;

import ch.azure.aurore.ebooks.main.DatabaseAccess;
import ch.azure.aurore.javaxt.fxml.AppState;
import ch.azure.aurore.javaxt.fxml.FXApplication;
import ch.azure.aurore.javaxt.strings.Strings;
import javafx.fxml.FXMLLoader;

public class App extends FXApplication {

    public static final String BOOK_SEARCH = "bookSearch";
    public static final String MAIN = "main";

    public static void main(String[] args) {
        launch();
    }

    @Override
    protected FXMLLoader getLoader(String token) {
        return switch (token) {
            case BOOK_SEARCH -> new FXMLLoader(App.class.getResource("/ch/azure/aurore/bookdb/BookSearch.fxml"));
            case MAIN -> new FXMLLoader(App.class.getResource("/ch/azure/aurore/ebooks/main/Main.fxml"));
            default -> throw new IllegalStateException("Unexpected value: " + token);
        };
    }

    @Override
    protected void start() {
        String folderPath = EBookState.getInstance().getFolderPath();
        if (!Strings.isNullOrEmpty(folderPath))
            DatabaseAccess.getInstance().loadDatabase(folderPath);

        switchScene(MAIN);
    }

    @Override
    protected void quit() {
        DatabaseAccess.getInstance().close();
    }

    @Override
    protected Class<? extends AppState> getStateType() {
        return EBookState.class;
    }
}
