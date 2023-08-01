package ro.bcr.advanced._4_generics._1_;

import java.util.ArrayList;
import java.util.List;

public class DemoWhyGenerics {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("string");
        list.add(123);
        list.add(new RuntimeException());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        List<String> myList = new ArrayList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));


    }
}
