package instruments;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String make, String model, String type, int strings) {
        super(make, model, type);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }
}
