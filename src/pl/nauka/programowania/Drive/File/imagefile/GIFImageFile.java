package pl.nauka.programowania.Drive.File.imagefile;

public class GIFImageFile extends abstractImageFile {

    public GIFImageFile(String name, int size) {
        super(name,size);
    }

    public void displayGIF() {
        System.out.println("Showing funny GIF");
    }
}
