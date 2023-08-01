package ro.bcr.advanced._5_lambda._5_built_in._2_consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class DemoBiConsumer {

    public static void main(String[] args) {

        BiConsumer<String, Integer> biConsumer =
                (s, i) -> System.out.println("String value: " + s + ", int value: " + i);

        biConsumer.accept("Chris Evans", 50);

        System.out.println("---------------");

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 30);
        ages.put("Samuel", 40);

        ages.forEach((k, v) -> System.out.println(k + " is " + v + " years old"));
    }
}
