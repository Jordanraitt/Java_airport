import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;

    @Before
    public void Flight(){
        flight = new Flight(plane,267, "Stavanger");
    }

    @Test
    public void hasPlane(){
        plane = new Plane(PlaneType.BOMBARDIER_CRJ900,"SAS" );
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals(0,flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("Stavanger",flight.getDestination());
    }
}
