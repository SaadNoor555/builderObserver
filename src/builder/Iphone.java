package builder;

public class Iphone extends Phone {

    @Override
    public String os() {
        return "iOS 15.0";
    }

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "iPhone";
    }
}
