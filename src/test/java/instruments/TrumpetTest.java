package instruments;

import materials.Material;
import materials.Metal;
import materials.Wood;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;
    Material metal;

    @Before
    public void before() {
        metal = new Metal(false);
        trumpet = new Trumpet("Fender", "F75", "Electric", metal);
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", trumpet.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("F75", trumpet.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Electric", trumpet.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals(metal, trumpet.getMadeOf());
    }

}
