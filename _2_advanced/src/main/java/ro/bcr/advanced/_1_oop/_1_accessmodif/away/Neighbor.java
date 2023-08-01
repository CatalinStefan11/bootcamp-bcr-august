package ro.bcr.advanced._1_oop._1_accessmodif.away;

import ro.bcr.advanced._1_oop._1_accessmodif.home.Parent;

public class Neighbor {

    public void hasAccessTo(){
        System.out.println("public " + new Parent().phoneNumber);
    }

    public void hasNoAccessTo(){
//        System.out.println("public " + new Parent().family);
//        System.out.println("public " + new Parent().wealth);
//        System.out.println("public " + new Parent().personalStuff);
    }
}
