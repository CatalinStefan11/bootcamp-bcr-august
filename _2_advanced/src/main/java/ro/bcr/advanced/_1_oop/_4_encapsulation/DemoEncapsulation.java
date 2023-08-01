package ro.bcr.advanced._1_oop._4_encapsulation;

public class DemoEncapsulation {

    public static void main(String[] args) {

        Person p1 = new Person("Catalin", "male", 25);

        p1.setAge(-100);
        p1.setFirstName("");

        System.out.println(p1.toString());
    }
}
