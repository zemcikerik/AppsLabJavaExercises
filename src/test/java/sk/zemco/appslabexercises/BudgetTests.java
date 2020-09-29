package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BudgetTests {

    @ParameterizedTest
    @MethodSource("getValuesFromExercise")
    public void testWithValuesFromExercise(Person[] people, int expected) {
        Assertions.assertEquals(expected, ExerciseApp.getPeopleBudget(people));
    }

    public static Stream<Arguments> getValuesFromExercise() {
        return Stream.of(
                Arguments.of(getFirstGroup(), 65700),
                Arguments.of(getSecondGroup(), 62600)
        );
    }

    private static Person[] getFirstGroup() {
        return new Person[]{
                new Person("John", 21, 23000),
                new Person("Steve", 32, 40000),
                new Person("Martin", 16, 2700)
        };
    }

    private static Person[] getSecondGroup() {
        return new Person[]{
                new Person("John", 21, 29000),
                new Person("Steve", 32, 32000),
                new Person("Martin", 16, 1600)
        };
    }

}
