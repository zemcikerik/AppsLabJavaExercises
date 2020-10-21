package sk.zemco.appslabexercises.backend.model;

public class Employee {

    protected float salary;
    protected int bonus;
    protected final EmployeeJobType type;

    public Employee(EmployeeJobType type) {
        this.type = type;
    }

    public Employee(float salary, int bonus, EmployeeJobType type) {
        this.salary = salary;
        this.bonus = bonus;
        this.type = type;
    }

    public String getInfo() {
        return String.format("%s's salary is %.1f and bonus is %d.", type.getName(), salary, bonus);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public EmployeeJobType getType() {
        return type;
    }
}
