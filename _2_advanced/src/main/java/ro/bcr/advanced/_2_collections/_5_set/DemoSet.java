package ro.bcr.advanced._2_collections._5_set;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

    public static void main(String[] args) {

        TravelDestination d1 = new TravelDestination("Amsterdam", "Nice city");
        TravelDestination d4 = new TravelDestination("Bucharest", "Our home");
        TravelDestination d2 = new TravelDestination("Barcelona", "Home city of FC Barcelona");
        TravelDestination d3 = new TravelDestination("Amsterdam", "Nice city");

        // the set doesn't allow duplicates
        Set<TravelDestination> mySet = new HashSet<>();

        mySet.add(d1);
        mySet.add(d2);
        mySet.add(d3);
        mySet.add(d4);

        for(var d : mySet){
            System.out.println(d);
        }
    }
}
