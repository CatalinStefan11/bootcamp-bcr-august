package ro.bcr.advanced._2_collections._3_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(2000));
        cars.add(new Car(2010));
        cars.add(new Car(1998));
        cars.add(new Car(1995));
        cars.add(new Car(2013));

        Collections.sort(cars);

        for(var c : cars){
            System.out.println(c);
        }

        compareTwoObjects();


    }

    public static void compareTwoObjects(){
        Car audi = new Car(2018);
        Car bugatti = new Car(2020);

        if(audi.compareTo(bugatti) < 0){
            System.out.println("Audi is older than buggati");
        }
    }
}
