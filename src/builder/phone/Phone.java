package builder.phone;

import builder.Item;
import builder.circuit.Circuit;
import builder.circuit.SiliconCircuit;

public abstract class Phone implements Item {
    public abstract String os();
    @Override
    public Circuit build() {
        return new SiliconCircuit();
    }

    @Override
    public abstract float price();
}