package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StudentTests {

    @Test
    public void testFirstExercise() {
        Student student = new Student("John", 12345);
        Assertions.assertEquals("John", student.getName());
        Assertions.assertEquals(12345, student.getStudentNumber());
    }

    @ParameterizedTest
    @MethodSource("getValuesFromSecondExercise")
    public void testSecondExercise(Student student, String expected) {
        Assertions.assertEquals(expected, ExerciseApp.getStudentInfo(student));
    }

    @SuppressWarnings("SpellCheckingInspection")
    public static Stream<Arguments> getValuesFromSecondExercise() {
        Student student1 = new Student(null, 2,
                "123456", "Legionarska 1, 01001 Zilina");

        Student student2 = new Student(null, 5,
                "456789", "Legionarska 2, 01001 Zilina");

        return Stream.of(
                Arguments.of(student1, "2, 123456, Legionarska 1, 01001 Zilina"),
                Arguments.of(student2, "5, 456789, Legionarska 2, 01001 Zilina")
        );
    }

}
