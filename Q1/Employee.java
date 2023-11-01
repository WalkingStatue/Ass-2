package MyPackageQ1;

public class Employee extends Person {
    private int empId;
    private double da;
    private double hra;

    public Employee(String firstName, String middleName, String lastName, String address, int age, int empId, double da, double hra) {
        super(firstName, middleName, lastName, address, age);
        this.empId = empId;
        this.da = da;
        this.hra = hra;
    }

    public double getNetSalary() {
        return da + hra;
    }

    @Override
    public String toString() {
        return "Employee [Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() +
                ", Employee ID: " + empId +
                ", DA: " + da +
                ", HRA: " + hra +
                ", Net Salary: " + getNetSalary() + "]";
    }
}
