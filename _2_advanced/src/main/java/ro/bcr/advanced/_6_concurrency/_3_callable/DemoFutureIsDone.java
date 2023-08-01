package ro.bcr.advanced._6_concurrency._3_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoFutureIsDone {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() ->{
            Thread.sleep(2000);
            return "Hello from callable";
        });

        // check if the result of the computation is done
        while(!future.isDone()){
            System.out.println("Task is still not done, I am doing something else");
            Thread.sleep(200);
        }

        String result = future.get();

        System.out.println(result);
    }
}
