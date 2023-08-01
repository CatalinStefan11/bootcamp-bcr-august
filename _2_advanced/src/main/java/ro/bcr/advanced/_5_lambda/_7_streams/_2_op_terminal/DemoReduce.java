package ro.bcr.advanced._5_lambda._7_streams._2_op_terminal;

import java.util.Arrays;
import java.util.List;

public class DemoReduce {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // identity - an element that is the initial value of the reduction operation
        // accumulator - a function that takes two parameters:
        //  -> a partial result of the reduction operation
        //  -> the next element of the stream
        int result = numbers.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println(result);

    }
}
