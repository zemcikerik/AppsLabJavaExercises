package sk.zemco.appslabexercises.backend.service;

import sk.zemco.appslabexercises.backend.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public float getTotalSalary(List<Employee> employees) {
        return (float) employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    @Override
    public int getTotalBonus(List<Employee> employees) {
        return employees.stream()
                .mapToInt(Employee::getBonus)
                .sum();
    }

}
