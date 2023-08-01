package ro.bcr.advanced._4_generics._1_;

public class DemoGenericBox {

    public static void main(String[] args) {

        GenericBox<Toy> toyGenericBox = new GenericBox<>();

        toyGenericBox.putObjectInside(new Toy());
        Toy myToy = toyGenericBox.getObjectInside();

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.putObjectInside("My string");
        System.out.println(stringGenericBox.getObjectInside());



    }
}
