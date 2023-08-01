package ro.bcr.advanced._5_lambda._5_built_in._3_supplier;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {

    public static void main(String[] args) {
        getSupplierException();
        System.out.println("----------");
        generateRandomNumber();

        getSquareLazy();
    }

    public static void getSupplierException() {
        Supplier<Exception> exceptionSupplier =
                () -> new RuntimeException("Hello from supplier");

        Exception ex = exceptionSupplier.get();

        System.out.println(ex);
    }

    public static void generateRandomNumber() {
        Supplier<Integer> randomNumberSupplier = () -> {
            System.out.println("Hello from supplier");
            Random r = new Random();
            return r.nextInt();
        };
        int result = randomNumberSupplier.get();
        System.out.println(result);
    }

    public static double squareLazy(Supplier<Double> lazyValue) {
        System.out.println("Square lazy first line");
        return Math.pow(lazyValue.get(), 2);
    }

    public static void getSquareLazy(){

        System.out.println("Hello before the supplier creation");

        Supplier<Double> supplier = () -> {
            try {
                System.out.println("Hello from supplier!");
                // simulate a long and complex operation
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            return new Random().nextDouble();
        };


        squareLazy(supplier);
    }
}
