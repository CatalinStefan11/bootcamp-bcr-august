package ro.bcr.advanced._1_oop._1_accessmodif;

import ro.bcr.advanced._1_oop._1_accessmodif.away.Neighbor;
import ro.bcr.advanced._1_oop._1_accessmodif.away.Sister;
import ro.bcr.advanced._1_oop._1_accessmodif.home.Child;

public class Postman {

    public static void main(String[] args) {

        new Sister().hasAccessTo();
        new Neighbor().hasAccessTo();

        new Child().hasAccessTo();
    }
}
