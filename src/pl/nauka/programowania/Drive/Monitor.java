package pl.nauka.programowania.Drive;

public class Monitor {
    private int width;
    private int height;


    public void setLowResolution() {
        width=800;
        height=600;
    }
    public void setHDResolution() {
        width= 1980;
        height=1080;
    }
    public void setHighResolution() {
        width= 3840;
        height=1920;
    }
    public String getResolution() {
        return width + "x" +height;
    }
}
