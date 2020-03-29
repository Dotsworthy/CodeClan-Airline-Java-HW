import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Passenger passenger;
    Plane plane;
    ArrayList<Passenger> passengers;
    FlightManager flightManager;
    Date departureTime;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 4, 100);
        departureTime = new Date(2020,02,28,19,00);
        passenger = new Passenger("Eleanor", 2, null, null);
        passengers = new ArrayList();

        flight = new Flight(passengers,
                plane,
                0001,
                "Naples",
                "Edinburgh",
                departureTime);
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
