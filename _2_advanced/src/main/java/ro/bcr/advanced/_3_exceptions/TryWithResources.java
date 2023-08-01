package ro.bcr.advanced._3_exceptions;

import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

//        regularTryCatch();
        tryWithResources();

    }

    public static void regularTryCatch(){
        Scanner scanner = null;

        try{
            scanner = new Scanner(System.in);
            System.out.println("You typed: " + scanner.next());
        } catch (Exception exception){
         // handle
        } finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }

    public static void tryWithResources(){

        try(Scanner scanner = new Scanner(System.in);){
            System.out.println("You typed: " + scanner.next());
        } catch (Exception exception){

        }
    }
}
