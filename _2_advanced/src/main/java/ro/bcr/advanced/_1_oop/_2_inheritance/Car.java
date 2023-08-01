package ro.bcr.advanced._1_oop._2_inheritance;

// Car is a vehicle
public class Car extends Vehicle{

    @Override
    public void fillTank(int amount) {
        super.fillTank(amount);
        System.out.println("Overridden method called");
    }

    // method overloading
    public void fillTank(int amount, String fuelType){
        super.fillTank(amount);
        System.out.println("Tank was filled with " + fuelType);
    }
}
