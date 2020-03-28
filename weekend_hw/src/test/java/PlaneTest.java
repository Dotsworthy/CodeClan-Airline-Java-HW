import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 2, 41000);
    }

    @Test
    public void canGetType() {
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(41000, plane.getWeight());
    }
}
