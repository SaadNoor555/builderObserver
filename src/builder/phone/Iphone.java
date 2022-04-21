package builder.phone;

import builder.phone.Phone;

public class Iphone extends Phone {

    @Override
    public String os() {
        return "iOS 15.0";
    }

    @Override
    public float price() {
        return 1300.0f;
    }

    @Override
    public String name() {
        return "iPhone";
    }
}
