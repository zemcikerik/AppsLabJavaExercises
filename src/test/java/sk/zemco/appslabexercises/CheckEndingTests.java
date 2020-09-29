package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CheckEndingTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(String str, String ending, boolean expected) {
        Assertions.assertEquals(expected, ExerciseApp.checkEnding(str, ending));
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of("abc", "bc", true),
                Arguments.of("abc", "d", false),
                Arguments.of("samurai", "zi", false),
                Arguments.of("feminine", "nine", true),
                Arguments.of("convention", "tio", false)
        );
    }

}
