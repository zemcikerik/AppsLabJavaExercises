package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EqualValuesTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(int a, int b, int c, int expected) {
        Assertions.fail("This exercise was not completed!");
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(3, 4, 3, 2),
                Arguments.of(1, 1, 1, 3),
                Arguments.of(3, 4, 1, 0)
        );
    }

}
