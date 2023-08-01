package ro.bcr.advanced._5_lambda._7_streams._2_op_terminal;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

    public static void main(String[] args){

        List<String> alphabets = Arrays.asList("aa", "bb", "cc", "test", "dog");

        alphabets.forEach((string) -> System.out.println(string));

        System.out.println("---------------");

        alphabets.forEach(System.out::println);

        System.out.println("---------------");

        alphabets.stream()
                .map(String::toUpperCase)
                .filter((s) -> s.length() > 2)
                .forEach(System.out::println);

        System.out.println("---------------");

        alphabets.stream()
                .mapToInt((s) -> s.length())
                .forEach(System.out::println);

        System.out.println("---------------");

        // sum is also a terminal operation which 'reduces' everything to a sum of ints
        int result = alphabets.stream()
                .mapToInt((s) -> s.length())
                .sum();

        System.out.println(result);
    }

}
