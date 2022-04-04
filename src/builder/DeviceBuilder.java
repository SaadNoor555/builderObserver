package builder;

public class DeviceBuilder {

    public Device prepareVegMeal (){
        Device device = new Device();
        device.addItem(new AndroidPhone());
        device.addItem(new TravelAdapter());
        return device;
    }

    public Device prepareNonVegMeal (){
        Device device = new Device();
        device.addItem(new Iphone());
        device.addItem(new WallAdapter());
        return device;
    }
}