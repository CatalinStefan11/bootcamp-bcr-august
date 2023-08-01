package ro.bcr.advanced._1_oop._2_abstraction;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor with params called");
    }

    public Shape() {
        System.out.println("Shape no-args constructor called");
    }

    abstract double getArea();

    public String getColor() {
        return color;
    }
}
