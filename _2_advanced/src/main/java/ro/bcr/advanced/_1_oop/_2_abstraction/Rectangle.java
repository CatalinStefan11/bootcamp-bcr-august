package ro.bcr.advanced._1_oop._2_abstraction;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
        System.out.println("Rectangle all-args constructord called");

    }

    @Override
    double getArea() {
        return length * width;
    }

    public void rectangleMethod(){
        System.out.println("Do something in rectangle");
    }
}
