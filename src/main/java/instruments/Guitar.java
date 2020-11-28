package instruments;

import materials.Material;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String make, String model, String type, Material madeOf, int strings) {
        super(make, model, type, madeOf);
        this.strings = strings;
    }


    public int getStrings() {
        return strings;
    }
}
