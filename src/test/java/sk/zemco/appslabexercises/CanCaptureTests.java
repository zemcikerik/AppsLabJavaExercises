package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CanCaptureTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(String pos, String pos2, boolean expected) {
        Assertions.assertEquals(expected, ExerciseApp.canCapture(pos, pos2));
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of("A8", "E8", true),
                Arguments.of("A1", "B2", false),
                Arguments.of("H4", "H3", true),
                Arguments.of("F5", "C8", false)
        );
    }

}
