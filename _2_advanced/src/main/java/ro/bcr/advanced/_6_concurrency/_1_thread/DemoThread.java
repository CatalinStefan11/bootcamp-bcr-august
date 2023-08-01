package ro.bcr.advanced._6_concurrency._1_thread;

public class DemoThread {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        MyThread thread = new MyThread();
        thread.start();

        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.stopRunning();
    }
}
