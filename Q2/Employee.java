package MyPackage;

public class Employee extends Person {
    private int employeeId;
    private String designation;
    private double salary;

    public Employee(String firstName, String lastName, int age, int employeeId, String designation, double salary) {
        super(firstName, lastName, age);
        this.employeeId = employeeId;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        super.display(); // Call the display method of the base class
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
