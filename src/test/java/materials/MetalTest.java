package materials;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetalTest {

    Material metal;

    @Before
    public void before() {
        metal = new Metal(false);
    }

    @Test
    public void hasSustainable() {
        assertEquals(false, metal.isSustainable());
    }
}
