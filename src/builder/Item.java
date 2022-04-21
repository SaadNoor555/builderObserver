package builder;

import builder.circuit.Circuit;

public interface Item {
    public String name();
    public Circuit build();
    public float price();
}