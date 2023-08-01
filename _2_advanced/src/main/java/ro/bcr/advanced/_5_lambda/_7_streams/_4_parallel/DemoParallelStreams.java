package ro.bcr.advanced._5_lambda._7_streams._4_parallel;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoParallelStreams {
    public static void main(String[] args) {
        regularStream();
        System.out.println("----------");
        parallelStreams();
    }

    public static void regularStream(){
        IntStream stream = IntStream.range(1, 10);
        System.out.println("Regular stream, is parallel: " + stream.isParallel());
        stream.forEach(System.out::println);
    }

    public static void parallelStreams(){
        IntStream stream = IntStream.range(1, 10).parallel();
        System.out.println("Regular stream, is parallel: " + stream.isParallel());
        stream.forEach(System.out::println);
    }
}
