public class FlightManager {

    public static int getWeightLimit(Plane plane) {
        int weight = plane.getWeight();
        int capacity = plane.getCapacity();
        int weightLimit = weight / capacity;
        return weightLimit;
    }
}
