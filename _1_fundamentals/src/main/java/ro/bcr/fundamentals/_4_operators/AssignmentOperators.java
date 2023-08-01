package ro.bcr.fundamentals._4_operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        int value = 1;

        value += 20;
        System.out.println(value);

        value -= 15;
        System.out.println(value);

        value *= 100;
        System.out.println(value);

        // value = value / 100
        value /= 100;
        System.out.println(value);
    }
}
