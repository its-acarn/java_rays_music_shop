package instruments;

import materials.Material;

public class Piano extends Instrument{

    private int keys;

    public Piano(String make, String model, String type, Material madeOf, int keys) {
        super(make, model, type, madeOf);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

}
