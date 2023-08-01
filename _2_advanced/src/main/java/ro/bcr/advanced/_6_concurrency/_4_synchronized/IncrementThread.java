package ro.bcr.advanced._6_concurrency._4_synchronized;

public class IncrementThread extends Thread {
    private final Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            counter.increment();
            System.out.println("Thread " + Thread.currentThread().getName()
            + ":counter = " + counter.getCount());

            try{
                // heavy work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
