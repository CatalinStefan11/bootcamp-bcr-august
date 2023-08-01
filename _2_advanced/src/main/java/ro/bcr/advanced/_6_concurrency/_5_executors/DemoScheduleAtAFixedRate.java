package ro.bcr.advanced._6_concurrency._5_executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoScheduleAtAFixedRate {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

        Runnable runnable = () -> {
            System.out.println("Executing task at: " + System.currentTimeMillis());
        };

        System.out.println("Scheduling tasks at every 2 seconds with an initial delay of 1 second");
        scheduledExecutorService.scheduleAtFixedRate(runnable, 1, 2, TimeUnit.SECONDS);
    }
}
