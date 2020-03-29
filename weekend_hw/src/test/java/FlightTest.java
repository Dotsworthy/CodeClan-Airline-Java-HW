import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Passenger passenger;
    Flight flight;
    ArrayList<Passenger> passengers;
    Date departureTime;


    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 2, 100);
        departureTime = new Date(2020, 02, 28, 19,00);
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
    public void canGetNoOFPassengers() {
        assertEquals(0, flight.getNoOfPassengers());
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals(0001, flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("Naples", flight.getDestination());
    }

    @Test
    public void canGetDepartsFrom() {
        assertEquals("Edinburgh", flight.getDepartsFrom());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals(departureTime, flight.getDepartureTime());
    }

    @Test
    public void canBookAPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNoOfPassengers());
    }

    @Test
    public void cantAddMoreThanCapacity() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(2, flight.getNoOfPassengers());
    }

    @Test
    public void canCreateSeatNumbers() {
        assertEquals(2,flight.getNoOfSeats());
    }

    @Test
    public void canRemoveSeatNumber() {
        flight.reserveSeat();
        assertEquals(1, flight.getNoOfSeats());
    }
}
