package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WarOfNumbersTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(int[] numbers, int expected) {
        Assertions.assertEquals(expected, ExerciseApp.warOfNumbers(numbers));
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(new int[]{ 2, 8, 7, 5 }, 2),
                Arguments.of(new int[]{ 12, 90, 75 }, 27),
                Arguments.of(new int[]{ 5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243 }, 168)
        );
    }

}
