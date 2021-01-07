package ch.azure.aurore.ebooks.main;

import ch.azure.aurore.ebooks.EBookState;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LibraryHandler {
    private static final String UNKNOWN_FOLDER = "_default";
    private MainController main;

    public LibraryHandler(MainController main) {
        this.main = main;
    }

    public void importFiles(List<Path> files) {
        Path defaultFolder = FileSystems.getDefault().getPath(EBookState.getInstance().getFolderPath(), UNKNOWN_FOLDER);
        System.out.println(defaultFolder.toAbsolutePath());

        try {
            Files.createDirectories(defaultFolder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Path f : files) {
            Path destination = defaultFolder.resolve(f.getFileName());
            System.out.println(destination.toAbsolutePath());
            try {
                Files.move(f, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        refreshLibrary();
    }

    public void refreshLibrary() {
        System.out.println("refresh");
    }
}
