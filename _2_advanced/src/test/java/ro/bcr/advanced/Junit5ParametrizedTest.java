package ro.bcr.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ro.bcr.advanced._8_tdd.junit.Day;
import ro.bcr.advanced._8_tdd.junit.MyCalendar;
import ro.bcr.advanced._8_tdd.junit.UtilityClass;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class Junit5ParametrizedTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 15, -9})
    void shouldBeDivisibleByThree(int number) {
        assertThat(UtilityClass.isDivisibleByThree(number)).isTrue();
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = " ")
    void shouldReturnTrueForNullOrEmptyString(String input) {
        assertThat(input == null || input.trim().isEmpty()).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"SATURDAY", "SUNDAY"})
    void shouldBeWeekendStringSource(Day input) {
        assertThat(MyCalendar.isWeekend(input)).isTrue();
    }


    @ParameterizedTest
    @EnumSource(
            value = Day.class,
            names = {"SATURDAY", "SUNDAY"}
    )
    void shouldBeWeekendEnumSource(Day input) {
        assertThat(MyCalendar.isWeekend(input)).isTrue();
    }

    @ParameterizedTest
    @MethodSource("numberToMonth")
    void shouldReturnMonthName(int monthNumber, String monthName){
        assertThat(MyCalendar.getMonthName(monthNumber)).isEqualTo(monthName);
    }

    private static Stream<Arguments> numberToMonth() {
        return Stream.of(
                Arguments.arguments(1, "Jan"),
                Arguments.arguments(6, "Jun"),
                Arguments.arguments(12, "Dec"),
                Arguments.arguments(-100, "not a month"),
                Arguments.arguments(-200, "not a month"),
                Arguments.arguments(13, "not a month")
        );
    }


}
