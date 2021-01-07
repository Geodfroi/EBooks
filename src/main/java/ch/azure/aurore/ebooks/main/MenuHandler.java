package ch.azure.aurore.ebooks.main;

import ch.azure.aurore.ebooks.App;
import ch.azure.aurore.ebooks.EBookState;
import ch.azure.aurore.javaxt.IO.API.Disk;
import ch.azure.aurore.javaxt.IO.API.FileExtension;
import ch.azure.aurore.javaxt.strings.Strings;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.DirectoryChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class MenuHandler {
    private final MenuItem closeMenu;
    private final MenuItem selectFolderMenu;
    private final MainController main;
    private final MenuItem importBooksMenu;
    private final MenuItem refreshLibraryMenu;
    private final MenuItem openLibraryFolder;

    public MenuHandler(MainController main) {
        this.main = main;

        closeMenu = new MenuItem("Close application");
        closeMenu.setOnAction(e -> Platform.exit());
        importBooksMenu = new MenuItem("Import books");
        importBooksMenu.setAccelerator(new KeyCodeCombination(KeyCode.I, KeyCombination.CONTROL_DOWN));
        importBooksMenu.setOnAction(e -> importBooksFolder());
        openLibraryFolder = new MenuItem("Open library folder");
        openLibraryFolder.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
        openLibraryFolder.setOnAction(e -> openLibrary());

        refreshLibraryMenu = new MenuItem("Refresh library");
        refreshLibraryMenu.setAccelerator(new KeyCodeCombination(KeyCode.R, KeyCombination.CONTROL_DOWN));
        refreshLibraryMenu.setOnAction(e -> main.getLibraryHandler().refreshLibrary());
        selectFolderMenu = new MenuItem("Select library folder");
        selectFolderMenu.setOnAction(e -> selectFolder());

        var testMenu = new MenuItem("test");
        testMenu.setAccelerator(new KeyCodeCombination(KeyCode.K, KeyCombination.CONTROL_DOWN));
        testMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                App.getInstance().switchScene(App.BOOK_SEARCH);
            }
        });
        main.fileMenu.getItems().add(testMenu);


        //    reloadFileMenu();
    }

    private void openLibrary() {
        String str = EBookState.getInstance().getFolderPath();
        Disk.openFile(str);
    }

    private void importBooksFolder() {
        DirectoryChooser dialog = new DirectoryChooser();
        dialog.setTitle("Select book folder to import");
        File folder = dialog.showDialog(main.getScene().getWindow());

        if (folder != null) {
            BookImporter b = new BookImporter();
            b.ImportFolder(folder);
            main.getLibraryHandler().importFiles(b.getToImport());
        }
    }

    private void selectFolder() {
        DirectoryChooser dialog = new DirectoryChooser();
        dialog.setTitle("Select library folder");
        File folder = dialog.showDialog(main.getScene().getWindow());

        if (folder != null) {
            String folderPath = folder.getAbsolutePath();
            EBookState.getInstance().setFolderPath(folderPath);
            DatabaseAccess.getInstance().loadDatabase(folderPath);
            reloadFileMenu();
        }
    }

    public void reloadFileMenu() {
        main.fileMenu.getItems().clear();

        boolean hasFolder = !Strings.isNullOrEmpty(EBookState.getInstance().getFolderPath());
        if (hasFolder) {
            main.fileMenu.getItems().add(openLibraryFolder);
            main.fileMenu.getItems().add(refreshLibraryMenu);
            main.fileMenu.getItems().add(importBooksMenu);
        } else {
            main.fileMenu.getItems().add(selectFolderMenu);
        }

        main.fileMenu.getItems().add(closeMenu);
    }
}

class BookImporter extends SimpleFileVisitor<Path> {
    private final List<Path> toImport = new ArrayList<>();

    public List<Path> getToImport() {
        return toImport;
    }

    public void ImportFolder(File folder) {
        try {
            Files.walkFileTree(folder.toPath(), this);
        } catch (IOException e) {
            System.out.println("Error walking [" + folder + "] file tree");
            e.printStackTrace();
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if (FileExtension.isExtension(file, FileExtension.EBOOK))
            toImport.add(file);

        return super.visitFile(file, attrs);
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.out.println("error assessing [" + file.toAbsolutePath() + "]");
        return FileVisitResult.CONTINUE;
    }
}
