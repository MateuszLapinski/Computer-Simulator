package pl.nauka.programowania.Drive.File.imagefile;

import pl.nauka.programowania.Drive.File.AbstractFile;
import pl.nauka.programowania.Drive.File.FileType;

public abstract class  abstractImageFile extends AbstractFile {
    protected String name;
    protected int size;

    protected abstractImageFile(String name, int size) {
        super(name, size);
    }
    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
