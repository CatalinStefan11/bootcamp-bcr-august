package ro.bcr.advanced._1_oop._2_inheritance;

public class DemoInheritance {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.fillTank(200);
        vehicle.drive();

        Car car = new Car();
        car.fillTank(500);
        car.fillTank(700, "gasoline");



    }
}
