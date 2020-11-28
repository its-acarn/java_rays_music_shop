package materials;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {
    Material brass;

    @Before
    public void before() {
        brass = new Brass(false);
    }

    @Test
    public void hasSustainable() {
        assertEquals(false, brass.isSustainable());
    }

}
