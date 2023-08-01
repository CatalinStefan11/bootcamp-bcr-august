package ro.bcr.fundamentals._2_conditionals;

public class DemoIfElse {

    public static void main(String[] args) {

        int balance = 1000;

        if(balance > 10){
            System.out.println("You are rich");
        } else{
            System.out.println("You need to start working");
        }

        int age = 19;

        if(age == 0){
            System.out.println("New born");
        } else if(age > 15) {
            System.out.println("Teenager");
        } else {
            System.out.println("Old");
        }

        String response = age >= 18 ? "adult" : "minor";

        System.out.println(response);
    }
}
