package ro.bcr.advanced._6_concurrency._4_synchronized;

public class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
