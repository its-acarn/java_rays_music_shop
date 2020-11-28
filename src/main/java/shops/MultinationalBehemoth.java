package shops;

import interfaces.IBuySell;
import java.util.ArrayList;

public abstract class MultinationalBehemoth {

    private String name;
    private String location;
    private ArrayList<IBuySell> stock;
    private int till;

    public MultinationalBehemoth(String name, String location, int till) {
        this.name = name;
        this.location = location;
        this.stock = new ArrayList<>();
        this.till = till;
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

    public int getTill() {
        return this.till;
    }
}
