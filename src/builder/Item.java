package builder;

public interface Item {
    public String name();
    public Circuit build();
    public float price();
}