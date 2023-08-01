package ro.bcr.advanced._5_lambda._7_streams._2_op_terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoCollect {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("one", "two", "three");

        // not executed without terminal operation
        Stream<String> stringStream = names.stream()
                .map(String::toUpperCase);

        List<String> upperCaseNames = stringStream
                .collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }

}
