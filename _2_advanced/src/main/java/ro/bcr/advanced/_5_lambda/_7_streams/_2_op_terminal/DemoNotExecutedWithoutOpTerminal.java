package ro.bcr.advanced._5_lambda._7_streams._2_op_terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoNotExecutedWithoutOpTerminal {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> stream = numbers.stream()
                .map(number -> {
                    System.out.println("Mapping: " + number);
                    return number * 2;
                })
                .filter(number -> {
                    System.out.println("Filtering: " + number);
                    return number % 2 == 0;
                });

        System.out.println("Streams operations defined, but not executed");

        // toList is an terminal operation which makes our stream to be executed
        List<Integer> result = stream.toList();

        // streams can be executed only one time
        // stream.forEach(System.out::println);

    }
}
