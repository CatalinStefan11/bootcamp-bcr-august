package ro.bcr.fundamentals._6_objects;

public class Car {
    // fields / attributes / instance variables / state of the class
    private String color;
    private int maxSpeed;
    private String brand;

    public Car(String color, int maxSpeed, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    // methods are the behavior of the class
    public void drive(){
        System.out.println("Driving");
    }

    public void stop(){
        System.out.println("Parked");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
