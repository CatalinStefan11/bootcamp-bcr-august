package ro.bcr.advanced._6_concurrency._3_callable;

import java.util.concurrent.*;

public class DemoFutureAndCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            System.out.println("Entered callable");
            // mimic some heavy work
            Thread.sleep(2000);
            return "Hello from callable";
        };


        System.out.println("Submitting callable");
        /*
        Future represent the result of an asynchronous computation that
        may not be available immediately. This allows as to perform other tasks
        in the meantime.
         */
        Future<String> future = executorService.submit(callable);

        System.out.println("Do something else while callable is getting executed");

        System.out.println("Retrieving the result of the future");

        // future.get() -> block the thread until the result is available
        String result = future.get();

        System.out.println(result);

    }
}
