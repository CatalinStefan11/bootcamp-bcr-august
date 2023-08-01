package ro.bcr.fundamentals._6_objects;

public class DemoCar {

    public static void main(String[] args) {

        Car c1 = new Car("black", 100, "honda");
        Car c2 = new Car("red", 300, "ferrari");

        c1.drive();
        c1.stop();

        c2.drive();
        c2.stop();
    }
}
