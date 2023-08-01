package ro.bcr.advanced._5_lambda._2_no_param;

public class DemoNoParam {

    public static void main(String[] args) {

        NoParam noParamShort = () -> "Alex";

        NoParam noParamLong = () -> {
            System.out.println("I'm a lambda expression");
            return "Hello from lambda";
        };

        String result = noParamShort.doSomething();
        System.out.println(result);

        System.out.println(noParamLong.doSomething());
    }
}
