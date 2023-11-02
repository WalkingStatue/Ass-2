import MyPackage.Employee;
import MyPackage.Person;
import MyPackage.Student;

public class Q2 {
    public static void main(String[] args) {
        try {
            System.out.println("Name: Dhruv Saija");
            System.out.println("Roll No: 3159");
            System.out.println("Division: B");
            Employee employee = new Employee("Dhruv", "Saija", 20, 101, "Manager", 60000);
            Student student = new Student("Harsh", "Panchal", 20, 201, "D-7 Rajnigandha Flats", 85.5);

            System.out.println("Employee Information:");
            employee.display();

            System.out.println("\nStudent Information:");
            student.display();
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
