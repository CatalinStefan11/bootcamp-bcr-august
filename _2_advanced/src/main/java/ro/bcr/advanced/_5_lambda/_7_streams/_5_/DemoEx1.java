package ro.bcr.advanced._5_lambda._7_streams._5_;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoEx1 {

    public static void main(String[] args) {
        processNames(Arrays.asList("John", "Sarah", "Mark", "Tyla", "Eamonn"));

        printValuesGreaterThan30AndLowerThan300(
                Arrays.asList(1, 4, 2345, 123, 234, 62, 0, 23, 50, 75));
    }

    public static void processNames(List<String> names) {
        names.stream()
                .map(name -> name.substring(1, name.length() - 1))
                .sorted()
                .forEach(System.out::println);
    }

    public static void printValuesGreaterThan30AndLowerThan300(List<Integer> input) {
        input.stream()
                .filter(x -> x > 30 && x < 200)
                .forEach(System.out::println);
    }
}
