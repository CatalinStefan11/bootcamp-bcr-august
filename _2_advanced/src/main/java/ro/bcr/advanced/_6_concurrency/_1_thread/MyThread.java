package ro.bcr.advanced._6_concurrency._1_thread;

public class MyThread extends Thread {

    /*
    In the given example, volatile keyword is used for ensuring
    that the flag variable is immediately visible to other threads
    after it was written by one thread.

    google search -> jenkov multithreading
     */
    public volatile boolean flag = true;

    public void stopRunning(){
        this.flag = false;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        while(flag){
            System.out.println("I am still running");
        }

        System.out.println("Stopped running");
    }
}
