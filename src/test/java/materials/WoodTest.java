package materials;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodTest {
    Material wood;

    @Before
    public void before() {
        wood = new Wood(true);
    }

    @Test
    public void hasSustainable() {
        assertEquals(true, wood.isSustainable());
    }

}
