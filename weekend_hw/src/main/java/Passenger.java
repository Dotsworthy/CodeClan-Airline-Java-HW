public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;
    private Integer seatNumber;

    public Passenger(String name, int numberOfBags, Flight flight, Integer seatNumber) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;

    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public Object getFlight() {
        return this.flight;
    }

    public void addFlight(Flight flight) {
        this.flight = flight;
    }

    public Integer getSeatNumber() {
        return this.seatNumber;
    }

    public void addSeatNumber(Integer seatNumber) {
        if (this.seatNumber == null) {
            this.seatNumber = seatNumber;
        }
    }
}
