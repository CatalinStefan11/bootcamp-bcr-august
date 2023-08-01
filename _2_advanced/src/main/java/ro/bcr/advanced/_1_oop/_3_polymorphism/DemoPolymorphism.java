package ro.bcr.advanced._1_oop._3_polymorphism;

public class DemoPolymorphism {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.walk();

        Animal dog = new Dog();
        dog.walk();

    }
}
