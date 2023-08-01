package ro.bcr.advanced._5_lambda._5_built_in._4_function;

import java.util.function.Function;

public class DemoFunction {

    public static void main(String[] args) {

/*        Function<String, Integer> functionLong = (String s) -> {
            return s.length() * 2;
        };*/

        Function<String, Integer> function = (s) -> s.length() * 2;

        int result = function.apply("Java is fun");

        System.out.println("Result after applying function: " + result);

        Function<Integer, Integer> oldSchool = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer % 3 * 200;
            }
        };

        System.out.println("Result from old school function: " + oldSchool.apply(52));



    }
}
