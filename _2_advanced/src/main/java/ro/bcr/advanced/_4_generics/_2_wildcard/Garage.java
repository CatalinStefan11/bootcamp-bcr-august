package ro.bcr.advanced._4_generics._2_wildcard;

public class Garage<T extends Vehicle> {

    public T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getObjectInside(){
        return this.vehicle;
    }
}
