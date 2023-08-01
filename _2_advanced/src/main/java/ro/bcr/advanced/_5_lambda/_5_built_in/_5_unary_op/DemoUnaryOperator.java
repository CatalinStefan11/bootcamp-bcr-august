package ro.bcr.advanced._5_lambda._5_built_in._5_unary_op;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bob", "Megan", "Josh");

        UnaryOperator<String> unaryOperator = (String input) -> {
            return input.toUpperCase();
        };

        names.replaceAll(unaryOperator);

        names.forEach((n) -> System.out.println(n));
    }
}
