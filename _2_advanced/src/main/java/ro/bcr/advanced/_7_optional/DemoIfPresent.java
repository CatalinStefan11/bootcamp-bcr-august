package ro.bcr.advanced._7_optional;

import java.util.Optional;

public class DemoIfPresent {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        gender.ifPresent((valueFromOptional) ->
                System.out.println("I unwrapped the optional " +
                        "and this the value: " + valueFromOptional));

        Optional<String> lowerCase = gender.map((valueFromOpt) -> valueFromOpt.toLowerCase());

        // still wrapped into an optional
        System.out.println(lowerCase);

        // wrapped
        String result = lowerCase.get();
        System.out.println(result);

    }
}
