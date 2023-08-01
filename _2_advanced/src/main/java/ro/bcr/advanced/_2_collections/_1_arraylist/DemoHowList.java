package ro.bcr.advanced._2_collections._1_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoHowList {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("England");
        countries.add("Spain");
        countries.add("China");
        countries.add("Korea");
        countries.add("Italy");

//        for(var c : countries){
//            System.out.println(c);
//        }

        Iterator<String> iterator = countries.iterator();

        while(iterator.hasNext()){
            String nextCountry = iterator.next();
            System.out.println(nextCountry.toUpperCase());
        }

        System.out.println("----------------");

        // constant lookup
        System.out.println(countries.get(3));


        System.out.println("Index of Italy: " + countries.indexOf("Italy"));

        countries.add(0, "Romania");

        printList(countries);

        System.out.println("-------------");

        countries.remove("Spain");
        printList(countries);

        if(countries.contains("China")){
            System.out.println("It contains China");
        }

        if(!countries.isEmpty()){
            System.out.println("List is not empty");
        }

        System.out.println("---------------------");

        Collections.sort(countries);

        printList(countries);
    }

    public static void printList(List<String> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
