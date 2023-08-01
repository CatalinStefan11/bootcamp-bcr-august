package ro.bcr.advanced._6_concurrency._5_executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoScheduledExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Executing task at: " + System.currentTimeMillis());
        };

        System.out.println("Submitting task at: " +
                System.currentTimeMillis() + " to be executed in 5 seconds.");

        scheduledExecutorService.schedule(task, 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
