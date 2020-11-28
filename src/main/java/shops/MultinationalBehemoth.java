package shops;

import shops.behaviours.ISell;

import java.util.ArrayList;

public abstract class MultinationalBehemoth {

    private String name;
    private String location;


    public MultinationalBehemoth(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }
}
