package builder;

import builder.adapter.TravelAdapter;
import builder.adapter.WallAdapter;
import builder.phone.AndroidPhone;
import builder.phone.Iphone;

public class DeviceBuilder {

    public Device preparePixel6 (){
        Device device = new Device();
        device.addItem(new AndroidPhone());
        device.addItem(new TravelAdapter());
//        device.addItem();
        return device;
    }

    public Device prepareiPhone13 (){
        Device device = new Device();
        device.addItem(new Iphone());
        device.addItem(new WallAdapter());
        return device;
    }
}