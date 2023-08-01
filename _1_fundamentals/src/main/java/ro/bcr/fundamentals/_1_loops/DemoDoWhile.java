package ro.bcr.fundamentals._1_loops;

public class DemoDoWhile {

    public static void main(String[] args) {
        int i = 0;

        // first iteration is happening no matter what
        do{
            System.out.println(i);
            i++;

        } while(i < 0);

    }
}
