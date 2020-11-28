package shops;

import shops.behaviours.IBuySell;
import java.util.ArrayList;

public abstract class MultinationalBehemoth {

    private String name;
    private String location;
    private ArrayList<IBuySell> stock;

    public MultinationalBehemoth(String name, String location) {
        this.name = name;
        this.location = location;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public int getStockAmount() {
        return this.stock.size();
    }
}
