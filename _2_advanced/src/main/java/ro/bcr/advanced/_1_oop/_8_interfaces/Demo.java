package ro.bcr.advanced._1_oop._8_interfaces;

public class Demo {

    public static void main(String[] args) {

        Drawable d = new Rectangle(10, 20);
        d.draw();

        d.myDefaultMethod();

        Drawable d2 = new Circle();
        d2.draw();

        ((Picture) d2).setBackgroundColor("red");
    }
}
