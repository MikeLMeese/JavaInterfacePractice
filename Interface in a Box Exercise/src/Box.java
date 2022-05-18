import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    ArrayList<Packable> contents = new ArrayList<Packable>();

    public Box (double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double weight() {
        double weight = 0;
        for (Packable item: contents) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if (item.weight() < this.maxWeight) {
            contents.add(item);
            this.maxWeight -= item.weight();
        }
        if (this.maxWeight < 0) {
            contents.remove(item);
            this.maxWeight += item.weight();
        }
    }

    public String toString() {
        int size = contents.size();
        return "Box: " + size + " items, total weight " + weight() + " kg";
    }
}