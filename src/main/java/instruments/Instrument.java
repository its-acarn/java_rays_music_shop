package instruments;

import materials.Material;
import interfaces.IBuyable;

public abstract class Instrument implements IBuyable {

    private String make;
    private String model;
    private String type;
    private Material madeOf;

    public Instrument(String make, String model, String type, Material madeOf) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.madeOf = madeOf;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public Material getMadeOf() {
        return madeOf;
    }
}
