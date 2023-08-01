package ro.bcr.fundamentals._4_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean trueStatement = true;
        boolean falseStatament = false;

        System.out.println(trueStatement && falseStatament);

        System.out.println(trueStatement || falseStatament);

        int value = 10;

        // short circuit operator -> because the first condition is true
        // -> everything is evaluated to true
        if(value == 10 || value++ > 5){
            System.out.println("True");
        }

        System.out.println(value);

        int anotherValue = 10;

        if(anotherValue == 10 | anotherValue++ > 5){
            System.out.println("True");
        }

        System.out.println(anotherValue);


    }
}
