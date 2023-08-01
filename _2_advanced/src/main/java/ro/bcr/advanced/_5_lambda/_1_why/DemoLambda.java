package ro.bcr.advanced._5_lambda._1_why;

public class DemoLambda {

    public static void main(String[] args) {
        withoutLambda();
        System.out.println("---------------");
        withLambda();
    }

    private static void withLambda(){
        // higher order function -> is a function/method that can be hold withing a variable
        // or returned or passed as a parameter
        Cleanable withLambda = () -> System.out.println("cleaning");
        withLambda.clean();
    }

    private static void withoutLambda(){
        Cleanable anonim = new Cleanable() {
            @Override
            public void clean() {
                System.out.println("washing");
            }
        };
        anonim.clean();
    }

}
