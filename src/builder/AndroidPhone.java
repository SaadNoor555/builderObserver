package builder;

public class AndroidPhone extends Phone {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Android Phone";
    }
}
