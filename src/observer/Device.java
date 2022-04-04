package observer;

public abstract class Device {
    protected Updater updater;
    protected abstract void update();
}
