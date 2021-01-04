package shops;

import instruments.Guitar;
import instruments.Trumpet;
import materials.Brass;
import materials.Metal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultinationalBehemothTest {

    MultinationalBehemoth shop;
    Guitar fender;
    Trumpet elkhart;
    Metal metal;
    Brass brass;

    @Before
    public void before() {
        shop = new MultinationalBehemoth("shop", "London", 1000);
        metal = new Metal(false);
        brass = new Brass(false);
        fender = new Guitar("Fender", "Double Bass", "Bass", metal, 4);
        elkhart = new Trumpet("Elkhart", "100 Series", "Blower", brass);
    }

    @Test
    public void hasNoStock() {
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void hasOneStock(){
        shop.addStock(fender);
        assertEquals(1, shop.getStockAmount());
    }

    @Test
    public void hasTwoStock(){
        shop.addStock(fender);
        shop.addStock(elkhart);
        assertEquals(2, shop.getStockAmount());
    }

}
