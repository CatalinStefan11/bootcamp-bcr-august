package ro.bcr.advanced._6_concurrency._5_executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorService {

    public static void main(String[] args) {

        System.out.println("Inside: " + Thread.currentThread().getName());

        System.out.println("Creating executor service...");
        // creates threads when needed and reuses the old ones which have finished
        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable runnable = () -> {
            System.out.println("Inside: " + Thread.currentThread().getName());
        };

        System.out.println("Submit the task specified by the runnable");
        executor.submit(runnable);

    }
}
