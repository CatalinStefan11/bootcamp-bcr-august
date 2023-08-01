package ro.bcr.advanced._5_lambda._3_one_param;

public class DemoOneParam {

    public static void main(String[] args) {

        OneParam longVersion = (int input) -> 5 * input;

        OneParam shortVersion = i -> 5 * i;

        System.out.println(shortVersion.doSomething(100));

        System.out.println(longVersion.doSomething(200));

    }
}
