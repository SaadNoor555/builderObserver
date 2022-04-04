package observer;

public class Laptop extends Device{
    public Laptop(Updater updater) {
        updater.addDevice(this);
        this.updater = updater;
    }

    @Override
    protected void update() {
        System.out.println("Laptop firmware updated to version: "+this.updater.getVersion());
    }
}
