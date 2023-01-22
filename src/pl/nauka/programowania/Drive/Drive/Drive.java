package pl.nauka.programowania.Drive.Drive;

import pl.nauka.programowania.Drive.File.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
