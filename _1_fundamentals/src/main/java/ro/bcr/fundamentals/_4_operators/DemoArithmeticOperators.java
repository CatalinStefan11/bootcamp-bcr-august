package ro.bcr.fundamentals._4_operators;

public class DemoArithmeticOperators {

    public static void main(String[] args) {

        int a = 11;
        int b = 5;

        int addition = a + b;
        System.out.println(addition);

        int subtraction = a - b;
        System.out.println(subtraction);

        int division = a / b;
        System.out.println(division);

        int multiplication = a * b;
        System.out.println(multiplication);

        int modulo = a % b;
        System.out.println(modulo);

        int age = 20;
        // post increment
        System.out.println(age++);

        System.out.println(age);


        int anotherAge = 10;
        // pre increment
        System.out.println(++anotherAge);
    }
}
