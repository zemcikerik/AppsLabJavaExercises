package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MultiplyByLengthTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(int[] input, int[] expected) {
        Assertions.fail("This exercise was not completed!");
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(new int[]{ 2, 3, 1, 0 }, new int[] { 8, 12, 4, 0 }),
                Arguments.of(new int[]{ 4, 1, 1 }, new int[] { 12, 3, 3 }),
                Arguments.of(new int[]{ 1, 0, 3, 3, 7, 2, 1 }, new int[] { 7, 0, 21, 21, 49, 14, 7 }),
                Arguments.of(new int[]{ 0 }, new int[] { 0 })
        );
    }

}
