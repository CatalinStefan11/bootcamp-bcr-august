package ro.bcr.advanced._5_lambda._5_built_in._2_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {

    public static void main(String[] args) {

        Consumer<String> consumer = (name) -> System.out.println("Hello, " + name);

        List<String> names = Arrays.asList("John", "Freddy", "Samuel");

        names.forEach(consumer);

        // high order function - I can pass it as parameter
        names.forEach(name -> System.out.println("Hello, from in line lambda, " + name));


        names.forEach(input -> {
            String result = input.toUpperCase();
            System.out.println("I'm a consumer");
            System.out.println(result);
            System.out.println("-------------");
        });
    }
}
