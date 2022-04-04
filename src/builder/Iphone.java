package builder;

public class Iphone extends Phone {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "iPhone";
    }
}
