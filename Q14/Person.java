package Mypackage;

public abstract class Person {
    protected String name;
    protected double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public abstract void hikeSalary(double percentage);

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}