package ro.bcr.advanced._5_lambda._7_streams._3_op_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

        List<Stream<Integer>> streams = Stream.of(evens, odds, primes)
                .map((List<Integer> list) -> list.stream())
        .collect(Collectors.toList());

        List<Integer> integerList = Stream.of(evens, odds, primes)
                // Stream<Stream<Integer> -> Stream<Integer>
                .flatMap((List<Integer> list) -> list.stream())
                .collect(Collectors.toList());

        integerList.forEach(System.out::println);
    }

}
