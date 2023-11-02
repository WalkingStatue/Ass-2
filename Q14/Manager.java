package Mypackage;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void hikeSalary(double percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("Percentage cannot be negative.");
        }
        salary += salary * (percentage / 100) + 5000;
    }
}