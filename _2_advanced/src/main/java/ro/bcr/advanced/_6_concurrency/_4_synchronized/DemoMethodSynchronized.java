package ro.bcr.advanced._6_concurrency._4_synchronized;

public class DemoMethodSynchronized {

    public static void main(String[] args) {

        Counter counter = new Counter();

        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        thread1.start();
        thread2.start();
    }
}
