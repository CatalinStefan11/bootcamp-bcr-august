package ro.bcr.advanced._4_generics._2_wildcard;

public class Bike extends Vehicle{

    public Bike() {
        System.out.println("Bike created");
    }

    @Override
    public void repair() {
        System.out.println("Repairing");
    }
}
