import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOMBARDIER_CRJ900, "SAS");
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOMBARDIER_CRJ900, plane.getType());
    }

    @Test
    public void hasAirline(){
        assertEquals("SAS", plane.getAirline());
    }

    @Test
    public void hasPassangers(){
        assertEquals(0,plane.getPassangers());
    }
}
