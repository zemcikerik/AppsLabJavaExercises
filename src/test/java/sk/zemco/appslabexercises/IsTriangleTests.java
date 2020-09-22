package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsTriangleTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(int a, int b, int c, boolean expected) {
        Assertions.assertEquals(expected, ExerciseApp.isTriangle(a, b, c));
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(2, 3, 4, true),
                Arguments.of(3, 4, 5, true),
                Arguments.of(4, 3, 8, false)
        );
    }

}
