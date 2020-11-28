package instruments;

import materials.Material;
import materials.Wood;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano guitar;
    Material wood;

    @Before
    public void before() {
        wood = new Wood(true);
        guitar = new Piano("Fender", "F75", "Electric", wood, 32);
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("F75", guitar.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals(wood, guitar.getMadeOf());
    }

    @Test
    public void hasKeys() {
        assertEquals(32, guitar.getKeys());
    }

}
