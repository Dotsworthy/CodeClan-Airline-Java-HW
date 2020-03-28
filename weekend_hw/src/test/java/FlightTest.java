import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FlightTest {

    Plane plane;
    Passenger passenger;
    Flight flight;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 2, 41000);
        passenger = new Passenger("Eleanor", 2);
        ArrayList<String> passengers = new ArrayList<>();
        flight = new Flight(passengers,plane, 0001, "Naples","Edinburgh", "1900");
    }

    @Test
    public void canGetPassengers() {
        assertEquals(0, flight.getPassengers());
    }
}
