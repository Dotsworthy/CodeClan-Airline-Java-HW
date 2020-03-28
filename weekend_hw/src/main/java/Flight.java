import java.util.ArrayList;

public class Flight {


    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departsFrom;
    private String departureTime;

    public Flight(ArrayList<Passenger> passengers, Plane plane, int flightNumber, String destination, String departsFrom, String departureTime) {
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

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }
}