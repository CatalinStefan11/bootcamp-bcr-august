package ro.bcr.advanced._4_generics._4_;

/*
Create a simple Generic class, that will give a possibility to store
any kind of value withing (array).
Add object of type String, Integer, Double to an array of that generic type.
Print all the values withing,
 */
public class DemoEx {

    public static void main(String[] args) {
        Object[] items = {"hello", 25, 2.5};
        Bag<Object> objectsBag = new Bag<>(items);
        objectsBag.printItems();
    }
}
