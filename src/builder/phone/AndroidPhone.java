package builder.phone;

public class AndroidPhone extends Phone {

    @Override
    public String os() {
        return "android 12.0";
    }

    @Override
    public float price() {
        return 800.0f;
    }

    @Override
    public String name() {
        return "Android Phone";
    }
}
