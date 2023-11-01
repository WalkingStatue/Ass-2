import MyPackage.Employee;
import MyPackage.Person;
import MyPackage.Student;

public class Q2 {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("John", "Doe", 30, 101, "Manager", 60000);
            Student student = new Student("Jane", "Smith", 20, 201, "123 Main St", 85.5);

            System.out.println("Employee Information:");
            employee.display();

            System.out.println("\nStudent Information:");
            student.display();
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
