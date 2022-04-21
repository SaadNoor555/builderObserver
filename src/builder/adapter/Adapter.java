package builder.adapter;

import builder.Item;
import builder.circuit.Circuit;
import builder.circuit.GalliumCircuit;

public abstract class Adapter implements Item {

    @Override
    public Circuit build() {
        return new GalliumCircuit();
    }

    @Override
    public abstract float price();
}
