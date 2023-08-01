package ro.bcr.advanced._7_optional;

import java.util.Optional;

public class DemoOptional {

    public static void main(String[] args) {
    // NullPointerException
    //  getString().length();

        Optional<String> optional = getOptionalNullString();

        if(optional.isEmpty()){
            System.out.println("Optional is empty");
        }

        String result = optional.orElse("default");
        System.out.println(result);

        Optional<String> notEmpty = getOptionalString();

        String result2 = notEmpty.orElse("default");
        System.out.println(result2);

        Optional<String> empty = getOptionalNullString();
        empty.orElseThrow(() -> new RuntimeException("Optional was empty"));
    }

    // problem
    public static String getString() {
        System.out.println("The result of the computation in this method is null");
        return null;
    }

    public static Optional<String> getOptionalNullString(){
        System.out.println("The result of this computation is this method is null");
        return Optional.ofNullable(null);
    }

    public static Optional<String> getOptionalString(){
        return Optional.of("value from optional");
    }
}
