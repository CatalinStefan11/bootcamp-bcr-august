package ro.bcr.advanced._1_oop._1_accessmodif.away;

import ro.bcr.advanced._1_oop._1_accessmodif.home.Parent;

public class Sister extends Parent {

    public void hasAccessTo(){
        System.out.println("public " + super.phoneNumber);
        System.out.println("protected " + this.wealth);
    }

    public void hasNoAccessTo(){
//        System.out.println("private " + this.personalStuff);
//        System.out.println("default  " + this.family);
    }
}
