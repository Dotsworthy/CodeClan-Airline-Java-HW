public class Plane {

    private PlaneType type;
    private int capacity;
    private int totalWeightKG;

    public Plane(PlaneType type, int capacity, int totalWeightKG) {
    this.type = type;
    this.capacity = capacity;
    this.totalWeightKG = totalWeightKG;
    }

    public PlaneType getType() {
        return this.type;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.totalWeightKG;
    }
}
