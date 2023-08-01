package ro.bcr.advanced._2_collections._4_map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    public static void main(String[] args) {

        Map<String, String> nameAndSurnameMap = new HashMap<>();

        nameAndSurnameMap.put("Vasile", "Ionescu");
        nameAndSurnameMap.put("Horia", "Stan");

        System.out.println(nameAndSurnameMap.get("Horia"));

        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Romania", "Bucharest");
        countries.put("Germany", "Berlin");
        countries.put("poland", "-");

        printMap(countries);

    }

    private static void printMap(Map<String, String> map){
        for(Map.Entry<String, String> el : map.entrySet()){
            String key = el.getKey();
            String value = el.getValue();
            System.out.println("Key: " + key + " : " + value);
        }
    }
}
