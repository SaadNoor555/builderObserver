package builder.adapter;

import builder.adapter.Adapter;

public class TravelAdapter extends Adapter {

    @Override
    public float price() {
        return 12.5f;
    }

    @Override
    public String name() {
        return "Travel Adapter";
    }
}
