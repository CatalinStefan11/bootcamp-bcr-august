package ro.bcr.advanced._4_generics._2_wildcard;

public class DemoWildcard {

    public static void main(String[] args) {

        Bike bike = new Bike();

        Garage<Bike> myGarage = new Garage<>(bike);

        System.out.println(myGarage.getObjectInside());

        // this is not allowed
        // Garage<String> myStringGarage = new Garage<String>()

    }

}
