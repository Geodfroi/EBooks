package ch.azure.aurore.ebooks.main;

import ch.azure.aurore.ebooks.data.DatabaseInfo;
import ch.azure.aurore.javaxt.IO.API.Disk;
import ch.azure.aurore.javaxt.sqlite.wrapper.SQLite;

import java.io.File;
import java.util.List;

public class DatabaseAccess {
    private static final String DATABASE_NAME = "ebooks.sqlite";
    private static DatabaseAccess instance = new DatabaseAccess();
    private SQLite sqLite;
    private DatabaseInfo info;

    public static DatabaseAccess getInstance(){
        return instance;
    }

    public void loadDatabase(String folderPath) {
        if (sqLite != null)
            throw new IllegalStateException("database already in use");
        String databasePath = folderPath + File.separator + DATABASE_NAME;
        Disk.backupFile(databasePath);

        sqLite = SQLite.connect(databasePath);
        System.out.println(folderPath);

        info = loadInfo();
    }

    private DatabaseInfo loadInfo() {
        List<DatabaseInfo> q = sqLite.queryItems(DatabaseInfo.class);
        if (q == null || q.size() == 0){
            DatabaseInfo info = new DatabaseInfo();
            sqLite.updateItem(info);
            return info;
        }
        return q.get(0);
    }

    public void close() {
        sqLite.close();
    }
}
