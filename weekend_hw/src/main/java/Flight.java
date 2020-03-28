import java.util.ArrayList;

public class Flight {


    private ArrayList<String> passengers;
    private final Object plane;
    private int flightNumber;
    private String destination;
    private String departsFrom;
    private String departureTime;

    public Flight(ArrayList<String> passengers, Plane plane, int flightNumber, String destination, String departsFrom, String departureTime){
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
}
