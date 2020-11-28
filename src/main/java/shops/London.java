package shops;

import shops.behaviours.IBuySell;

import java.util.ArrayList;

public class London extends MultinationalBehemoth implements IBuySell {

    private ArrayList<IBuySell> stock;

    public London(String name, String location) {
        super(name, location);
        this.stock = new ArrayList<IBuySell>();

    }

    public IBuySell sell() {
        return this.stock.remove(IBuySell);
    }

    @Override
    public IBuySell buy() {
        return this.stock.add(IBuySell);
    }
}
