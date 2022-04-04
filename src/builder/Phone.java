package builder;

public abstract class Phone implements Item {

    @Override
    public Circuit packing() {
        return new SiliconCircuit();
    }

    @Override
    public abstract float price();
}