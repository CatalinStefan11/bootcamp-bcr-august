package ro.bcr.advanced._6_concurrency._3_callable;

import java.util.concurrent.Callable;

public class DemoCallable {

    public static void main(String[] args) {

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(200);
                return "Return some result";
            }
        };

        Callable<String> callable2 = () -> {
            Thread.sleep(200);
            return "Return some result";
        };

    }
}
