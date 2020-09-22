package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DivideSlicesTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(int total, int people, int each, boolean expected) {
        Assertions.fail("This exercise was not completed!");
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(11, 5, 2, true),
                Arguments.of(11, 5, 3, false),
                Arguments.of(8, 3, 2, true),
                Arguments.of(8, 3, 3, false),
                Arguments.of(24, 12, 2, true)
        );
    }

    @Test
    public void testWithZeroPeople() {
        Assertions.fail("This exercise was not completed!");
    }

}
