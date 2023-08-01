package ro.bcr.advanced._1_oop._2_abstraction;

public class DemoAbstraction {

    public static void main(String[] args) {

        Shape shape1 = new Square("red", 25);
        Rectangle shape2 = new Rectangle("black", 10, 20);

        System.out.println(shape1.getArea());
        System.out.println(shape1.getColor());
        // is not visible
        // shape1.squareMethod()

        System.out.println(shape2.getArea());
        System.out.println(shape2.getColor());
        // it is visible
        shape2.rectangleMethod();

    }
}
