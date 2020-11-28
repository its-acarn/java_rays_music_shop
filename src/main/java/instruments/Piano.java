package instruments;

public class Piano extends Instrument {

    private int keys;

    public Piano(String make, String model, String type, int keys) {
        super(make, model, type);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }
}
