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
        flight = new Flight(passengers, plane, 0001, "Naples","Edinburgh", "19:00");
    }

    @Test
    public void canCalculateWeightLimitForCapacity() {
        assertEquals(25, flightManager.getWeightLimitPerPassenger(plane));
    }

    @Test
    public void canCalculateBaggageWeightBookedForPassenger() {
        flight.addPassenger(passenger);
        assertEquals(25,flightManager.getWeightUsed(flight));
    }

    @Test
    public void canGetWeightRemaining() {
        flight.addPassenger(passenger);
        assertEquals(75, flightManager.getWeightRemaining(flight));
    }
}
