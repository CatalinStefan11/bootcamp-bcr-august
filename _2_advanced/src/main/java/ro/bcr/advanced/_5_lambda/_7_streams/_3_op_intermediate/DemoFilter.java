package ro.bcr.advanced._5_lambda._7_streams._3_op_intermediate;

import java.util.ArrayList;
import java.util.List;

public class DemoFilter {

    public static void main(String[] args) {

        List<String> products = new ArrayList<>();
        products.add("Lollipop");
        products.add("KitKat");
        products.add("Jelly Bean");
        products.add("Ice Cream");
        products.add("Gingerbread");

        // using filer we print all the strings that have a length grater than 10
        products.stream()
                .filter(s -> s.length() > 10)
                .forEach(System.out::println);

        System.out.println("-------------------");

        String result = products.stream()
                .filter(s -> s.contains("e"))
                .findFirst().get();

        System.out.println(result);


    }
}
