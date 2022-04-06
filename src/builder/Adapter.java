package builder;

public abstract class Adapter implements Item {

    @Override
    public Circuit build() {
        return new GalliumCircuit();
    }

    @Override
    public abstract float price();
}
