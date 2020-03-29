import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Passenger passenger;
    Plane plane;
    ArrayList<Passenger> passengers;
    FlightManager flightManager;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 4, 100);
        passenger = new Passenger("Eleanor", 2);
        passengers = new ArrayList();
        flight = new Flight(passengers, plane, 0001, "Naples","Edinburgh", "1900");
    }

    @Test
    public void canCalculateWeightLimitForCapacity() {
        assertEquals(25, flightManager.getWeightLimit(plane));
    }

}
