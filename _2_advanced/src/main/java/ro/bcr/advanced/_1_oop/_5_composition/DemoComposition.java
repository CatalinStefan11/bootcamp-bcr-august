package ro.bcr.advanced._1_oop._5_composition;

public class DemoComposition {

    public static void main(String[] args) {

        Engine e = new Engine();

        Car car = new Car(e);
        car.drive();

        Car c2 = new Car(new Engine());
        c2.drive();
    }
}
