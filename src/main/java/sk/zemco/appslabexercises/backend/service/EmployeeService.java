package sk.zemco.appslabexercises.backend.service;

import sk.zemco.appslabexercises.backend.model.Employee;

import java.util.List;

public interface EmployeeService {

    float getTotalSalary(List<Employee> employees);
    int getTotalBonus(List<Employee> employees);

}
