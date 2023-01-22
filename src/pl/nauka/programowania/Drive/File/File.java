package pl.nauka.programowania.Drive.File;

public interface File {
    String getName();
    int getSize();
    FileType getType();
    default int getVersion(){
        return 1;
    }
}
