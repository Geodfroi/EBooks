package ch.azure.aurore.ebooks;

import ch.azure.aurore.javaxt.fxml.AppState;

public class EBookState extends AppState {

    private String folderPath;

    public static EBookState getInstance() {
        return (EBookState) App.getInstance().getState();
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String value) {
        this.folderPath  = value;
        modified();
    }
}
