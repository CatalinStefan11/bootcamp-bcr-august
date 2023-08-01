package ro.bcr.advanced._1_oop._8_interfaces;

public class Circle implements Picture {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void setBackgroundColor(String color) {
        System.out.println("The background is now " + color);
    }
}
