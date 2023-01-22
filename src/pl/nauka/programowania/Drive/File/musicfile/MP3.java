package pl.nauka.programowania.Drive.File.musicfile;

public class MP3 extends AbstractMusicFile{
    private  int quality;
    public MP3(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality=quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 Music");

    }
    public int getQuality() {
    return quality;
    }

    @Override
    public String getName() {
        return "Plik nazywa się: " + super.getName();
    }

    @Override
    public String toString() {
        return "MP3{" +
                "bandName='" + bandName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

