package ro.bcr.advanced._5_lambda._5_built_in._1_predicate;

import java.util.function.Predicate;

public class DemoPredicate {

    /*
    The predicate is a functional interface that is specialized in checking
    if a condition is true or false. If can be used with Streams API to filter collections.
     */

    public static void main(String[] args) {

        Predicate<String> startsWithAPredicate =  (input) -> {
            System.out.println("Hello from predicate");
            return input.startsWith("A");
        };

        Predicate<String> startsWithBPredicate = i -> i.startsWith("B");

        boolean result = startsWithAPredicate.test("Leonardo");
        System.out.println("Leonardo starts with A? - " + result);

        result = startsWithBPredicate.test("Beinur");
        System.out.println("Beinur starts with B? - " + result);
    }
}
