package ro.bcr.advanced._5_lambda._4_two_params;

public class DemoTwoParam {

    public static void main(String[] args) {

        TwoParam paramShort = (s1, s2) -> s1.concat(s2.toUpperCase());

        TwoParam paramLong = (String s1, String s2) -> {
            System.out.println("Hello from lambda");
            return s1.toLowerCase() + " " + s2.toLowerCase();
        };

        String result = paramShort.doSomething("Leo", "Messi");
        System.out.println("Result from lambda short: " + result);

        result = paramLong.doSomething("Cristiano", "Ronaldo");
        System.out.println("Result from lambda long: " + result);


    }
}
