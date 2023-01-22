package pl.nauka.programowania.Drive;

import pl.nauka.programowania.Drive.Drive.Drive;
import pl.nauka.programowania.Drive.USBDevice.usbdevice;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    private List<usbdevice> USBDevices= new ArrayList<>();

    public Computer(Monitor monitor, Drive drive){
        this.monitor=monitor;
        this.drive= drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public List<usbdevice> getUSBDevices() {
        return USBDevices;
    }
    public void addUSBdevice(usbdevice usbdevice) {
        boolean isConnected = usbdevice.connect();
        if (isConnected) {
            USBDevices.add(usbdevice);
        }
    }
    public void removeUSBdevice(usbdevice usbdevice) {
        boolean isDisconnected = usbdevice.disconnect();
        if (isDisconnected) {
            USBDevices.remove(usbdevice);
        }
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }
}
