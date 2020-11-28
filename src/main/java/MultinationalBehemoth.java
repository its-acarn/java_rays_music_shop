import java.util.ArrayList;

public abstract class MultinationalBehemoth {

    private String name;
    private String location;
    private ArrayList<ISell> stock;

    public MultinationalBehemoth(String name, String location) {
        this.name = name;
        this.location = location;
        this.stock = new ArrayList<ISell>();
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
