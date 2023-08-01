package ro.bcr.advanced._6_concurrency._2_runnable;

import java.util.Arrays;
import java.util.List;

public class DemoRunnable {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("running");

        Thread worker = new Thread(task);
        worker.start();

        // old school runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable");
            }
        };

        final List<String> names = Arrays.asList("ana", "alex", "sorin");
        Runnable namePrinter = () -> {
            System.out.println("Hello from runnable");
            names.forEach(System.out::println);
        };

        Thread thread = new Thread(namePrinter);
        thread.start();

    }
}
