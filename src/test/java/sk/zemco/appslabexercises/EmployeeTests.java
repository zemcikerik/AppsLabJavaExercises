package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmployeeTests {

    @Test
    @SuppressWarnings("SpellCheckingInspection")
    public void testFromExercise() {
        JobPosition position = new JobPosition("IT programmer", 2100);
        Calendar dateOfBirth = new GregorianCalendar(1990, Calendar.JULY, 4);
        Employee employee = new Employee("Jozko", "Mrkvicka", dateOfBirth, position);

        Assertions.assertEquals("Jozko Mrkvicka, IT programmer, salary: 2100 eur",
                ExerciseApp.getFormattedEmployeeInfo(employee));
    }
}
