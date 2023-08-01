package ro.bcr.advanced._1_oop._8_interfaces;

public class Rectangle implements Drawable {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public double getArea(){
        return length * width;
    }
}
