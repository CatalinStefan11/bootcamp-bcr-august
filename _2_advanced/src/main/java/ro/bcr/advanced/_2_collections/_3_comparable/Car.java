package ro.bcr.advanced._2_collections._3_comparable;

public class Car implements Comparable<Car> {

    private int fabricationYear;

    public Car(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    @Override
    public int compareTo(Car o) {
        return this.fabricationYear - o.fabricationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fabricationYear=" + fabricationYear +
                '}';
    }
}
