import java.util.ArrayList;

public class Flight {

    private ArrayList<String> passengers;
    private String plane;
    private int flightNumber;
    private String destination;
    private String departsFrom;
    private String departureTime;

    public Flight(ArrayList<String> passengers, String plane, int flightNumber, String destination, String departsFrom, String departureTime){
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departsFrom = departsFrom;
        this.departureTime = departureTime;
    }



}
