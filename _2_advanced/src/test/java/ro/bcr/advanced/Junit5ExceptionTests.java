package ro.bcr.advanced;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Junit5ExceptionTests {

    @Test
    void testExpectedException() {
        Assertions.assertThrows(NumberFormatException.class, () ->
                Integer.parseInt("one"));
    }

    @Test
    void testSuperTypeException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                Integer.parseInt("one"));
    }

    @Test
    @Disabled
    void testExpectedExceptionFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                Integer.parseInt("1"));
    }
}
