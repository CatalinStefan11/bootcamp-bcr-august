package ro.bcr.advanced._3_exceptions;

public class StackOverflow {

    public static void work(int i){
        if(i == 0){
            System.out.println("ok");
        } else{
            work(i++);
        }
    }
}
