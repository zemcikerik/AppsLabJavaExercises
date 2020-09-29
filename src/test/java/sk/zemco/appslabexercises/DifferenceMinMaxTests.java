package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DifferenceMinMaxTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(int[] numbers, int expected) {
        Assertions.assertEquals(expected, ExerciseApp.differenceMinMax(numbers));
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(new int[]{ 10, 4, 1, 4, -10, -50, 32, 21 }, 82),
                Arguments.of(new int[]{ 44, 32, 86, 19 }, 67)
        );
    }

}
