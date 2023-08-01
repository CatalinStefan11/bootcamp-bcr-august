package ro.bcr.advanced._5_lambda._1_why;

public class CleanableImpl implements Cleanable{
    @Override
    public void clean() {
        System.out.println("Cleaning");
    }
}
