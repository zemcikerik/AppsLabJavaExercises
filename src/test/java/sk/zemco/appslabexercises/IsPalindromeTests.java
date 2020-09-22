package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsPalindromeTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(String input, boolean expected) {
        Assertions.fail("This exercise was not completed!");
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of("mom", true),
                Arguments.of("scary", false),
                Arguments.of("reviver", true),
                Arguments.of("stressed", false)
        );
    }

}
