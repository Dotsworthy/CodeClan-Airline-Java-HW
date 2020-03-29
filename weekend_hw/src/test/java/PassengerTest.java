import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Plane plane;
    Date departureTime;
    ArrayList<Passenger> passengers;
    Flight flight;


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
    public void canGetName(){
        assertEquals("Eleanor", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canGetFlight() { assertEquals(null,passenger.getFlight());}

    @Test
    public void canAddFlight() {
        passenger.addFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void canGetSeatNumber() {
        assertEquals(null, passenger.getSeatNumber());
    }

//    ask about oddness with test and taking in Integer here.
    @Test
    public void canAddSeatNumber() {
        Integer seatNumber = 1;
        passenger.addSeatNumber(seatNumber);
        assertEquals(seatNumber, passenger.getSeatNumber());
    }

    @Test
    public void cantAddMoreThanOneSeat() {
        Integer seatNumber = 1;
        Integer secondSeatNumber = 2;
        passenger.addSeatNumber(seatNumber);
        passenger.addSeatNumber(secondSeatNumber);
        assertEquals(seatNumber, passenger.getSeatNumber());
    }

}
