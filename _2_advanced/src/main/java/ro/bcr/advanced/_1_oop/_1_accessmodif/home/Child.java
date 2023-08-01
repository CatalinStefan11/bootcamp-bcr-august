package ro.bcr.advanced._1_oop._1_accessmodif.home;

public class Child extends Parent{

    public void hasAccessTo(){
        System.out.println("public " + super.phoneNumber);
        System.out.println("protected " + this.wealth);
        System.out.println("default  " + this.family);
    }

    public void hasNoAccessTo(){
//        System.out.println("private " + this.personalStuff);
    }
}
