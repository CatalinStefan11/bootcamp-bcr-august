package ro.bcr.advanced._5_lambda._7_streams._5_;

import java.util.Arrays;
import java.util.List;

public class DemoEx2 {

    public static void main(String[] args) {
        System.out.println(getProductOfPositiveNumbers());

        System.out.println("------------------------");

        List<String> values = Arrays.asList("Ana", "Maria", "Cristina", "Sofia", "Andrei");
        getUppercaseStrings(values);
    }

    public static int getProductOfPositiveNumbers() {

        List<Integer> integerList = Arrays.asList(1, -2, 3, 4, -5, -7);

        int product = integerList.stream()
                .filter(n -> n > 0)
                .reduce(1, (subtotal, element) -> subtotal * element);

        return product;
    }

    public static void getUppercaseStrings(List<String> values) {
        values.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}
