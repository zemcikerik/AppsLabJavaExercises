package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SnailDistanceTests {

    private static final double TOLERANCE = 0.1;

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(double stepHeight, double stepLength, double towerHeight, double expected) {
        Assertions.assertEquals(expected, ExerciseApp.snailDistance(stepHeight, stepLength, towerHeight), TOLERANCE);
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(0.2, 0.4, 100.0, 300.0),
                Arguments.of(0.3, 0.2, 25.0, 41.667),
                Arguments.of(0.1, 0.1, 6.0, 12.0)
        );
    }

}
