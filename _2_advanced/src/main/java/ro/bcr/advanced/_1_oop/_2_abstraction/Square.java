package ro.bcr.advanced._1_oop._2_abstraction;

public class Square extends Shape{

    double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
        System.out.println("Sqaure all-args constructor.");

    }

    public Square() {
        System.out.println("Sqaure no-args constructor.");
    }

    @Override
    double getArea() {
        return Math.pow(length, 2);
    }

    public void squareMethod(){
        System.out.println("Do something");
    }
}
