package builder.adapter;

import builder.adapter.Adapter;

public class WallAdapter extends Adapter {

    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "Wall Adapter";
    }
}
