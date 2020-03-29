import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Flight {


    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departsFrom;
    private Date departureTime;

    public Flight(ArrayList<Passenger> passengers, Plane plane, int flightNumber, String destination, String departsFrom, Date departureTime) {
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departsFrom = departsFrom;
        this.departureTime = departureTime;

    }

    public int getNoOfPassengers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return (Plane) this.plane;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartsFrom() {
        return this.departsFrom;
    }

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }
}