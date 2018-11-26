import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Airport airport;
    Plane plane;
    Flight flight;

    @Before
    public void before(){
        airport = new Airport("OSL");
        plane = new Plane(PlaneType.AIRBUS_A319_100, "SAS");
        flight =  new Flight(plane, 267, "Stavanger");
    }

    @Test
    public void hasHanger() {
        plane = new Plane(PlaneType.BOMBARDIER_CRJ900, "SAS");
        assertEquals(plane, airport.getHangar());
    }

    @Test
    public void addToHanger() {
        hangar.add(plane);
        assertEquals(1, airport.hangarCount());
    }

    @Test
    public void hangerCount(){
        assertEquals(0, airport.hangarCount());
    }

    @Test
    public void canTakeFromHangar() {
        hangar.add(plane);
        airport.takePlaneFromHanger();
        assertEquals(0, airport.hangarCount());
    }

    @Test
    public void hasPortCode() {
        assertEquals("OSL", airport.getPortCode());
    }

    @Test
    public void hasFlight() {
        flight = new Flight(plane, 267, "Stavanger");
        assertEquals(flight, airport.newFlight());
    }

}
