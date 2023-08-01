package ro.bcr.advanced._1_oop._5_composition;

// composition - a car has an engine -> the composed object cannot
// exist without the other entity
public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        System.out.println("Driving");
    }
}
