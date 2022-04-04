package observer;

import java.util.ArrayList;
import java.util.List;

public class Updater {
    private List<Device> observers = new ArrayList<Device>();
    private double version;

    public void attach(Device device){
        observers.add(device);
    }

    public Updater(double version) {
        this.version = version;
    }

    public void updateVersion(double version){
        this.version = version;
        updateFirmware();
    }
    private void updateFirmware(){
        for (Device observer : observers){
            observer.update();
        }
    }
    protected void addDevice(Device device){
        this.observers.add(device);
    }
    protected double getVersion(){
        return this.version;
    }
}
