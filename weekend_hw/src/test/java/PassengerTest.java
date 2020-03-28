import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Gary", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Gary", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

}
