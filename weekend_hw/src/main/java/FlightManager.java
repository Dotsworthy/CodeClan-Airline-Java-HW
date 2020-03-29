public class FlightManager {

    public static int getWeightLimitPerPassenger(Plane plane) {
        int weight = plane.getWeight();
        int capacity = plane.getCapacity();
        int weightLimitPerPassenger = weight / capacity;
        return weightLimitPerPassenger;
    }

    public static int getWeightUsed(Flight flight) {
        int weightLimitPerPassenger = getWeightLimitPerPassenger(flight.getPlane());
        int NoOfPassengers = flight.getNoOfPassengers();
        int weightUsed = weightLimitPerPassenger * NoOfPassengers;
        return weightUsed;
    }
}
