package sk.zemco.appslabexercises.backend;

import sk.zemco.appslabexercises.backend.model.Driver;
import sk.zemco.appslabexercises.backend.model.Employee;
import sk.zemco.appslabexercises.backend.model.Programmer;
import sk.zemco.appslabexercises.backend.model.Teacher;
import sk.zemco.appslabexercises.backend.service.EmployeeService;
import sk.zemco.appslabexercises.backend.service.EmployeeServiceImpl;

import java.util.List;

public class InheritanceExercises {

    private static List<Employee> getExampleEmployees() {
        return List.of(
                new Programmer(1000, 100),
                new Teacher(2000, 200),
                new Driver(3000, 300)
        );
    }

    public static void printExampleEmployeeInfo() {
        getExampleEmployees().stream()
                .map(Employee::getInfo)
                .forEach(System.out::println);
    }

    public static void printEmployeeServiceExampleOutput() {
        // dependency inversion failed
        EmployeeService employeeService = new EmployeeServiceImpl();
        List<Employee> employees = getExampleEmployees();

        float totalSalary = employeeService.getTotalSalary(employees);
        System.out.printf("getTotalSalary() -> %.1f%n", totalSalary);

        int totalBonus = employeeService.getTotalBonus(employees);
        System.out.printf("getTotalBonus -> %d%n", totalBonus);
    }

}
