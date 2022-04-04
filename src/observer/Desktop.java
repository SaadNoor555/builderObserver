package observer;

public class Desktop extends Device{
    public Desktop(Updater updater) {
        updater.addDevice(this);
        this.updater = updater;
    }

    @Override
    protected void update() {
        System.out.println("Desktop firmware updated to version: "+this.updater.getVersion());
    }
}
