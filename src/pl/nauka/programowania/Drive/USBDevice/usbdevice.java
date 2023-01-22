package pl.nauka.programowania.Drive.USBDevice;

public interface usbdevice {
    boolean connect();
    boolean disconnect();
    String getName();

}
