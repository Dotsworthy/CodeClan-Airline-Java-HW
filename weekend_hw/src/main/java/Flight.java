
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departsFrom;
    private Date departureTime;
    ArrayList<Integer> seatNumbers;

    public Flight(ArrayList<Passenger> passengers, Plane plane, int flightNumber, String destination, String departsFrom, Date departureTime) {
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departsFrom = departsFrom;
        this.departureTime = departureTime;
        this.seatNumbers = new ArrayList<Integer>();
        createSeatNumbers();

    }

    public int getNoOfPassengers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
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
            passenger.addSeatNumber(reserveSeat());
        }
    }

    public ArrayList createSeatNumbers() {
        int index = 1;
        while (index <= plane.getCapacity()) {
            this.seatNumbers.add(index);
            index++;
        }
        Collections.shuffle(seatNumbers);
        return seatNumbers;
    }

    public int getNoOfSeats() {
        return this.seatNumbers.size();
    }

    public int reserveSeat() {
        return seatNumbers.remove(0);
    }
}