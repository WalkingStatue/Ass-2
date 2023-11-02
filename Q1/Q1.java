import MyPackageQ1.Employee;
import MyPackageQ1.Person;
import MyPackageQ1.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
          try {
            System.out.println("Name: Dhruv Saija");
            System.out.println("Roll No: 3159");
            System.out.println("Division: B");
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student details:");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Middle Name: ");
            String middleName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Division: ");
            String division = scanner.nextLine();
            System.out.print("Date of Birth: ");
            String dateOfBirth = scanner.nextLine();

            Student student = new Student(firstName, middleName, lastName, address, age, rollNo, division, dateOfBirth);
            students.add(student);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter employee details:");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Middle Name: ");
            String middleName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("DA: ");
            double da = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("HRA: ");
            double hra = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            Employee employee = new Employee(firstName, middleName, lastName, address, age, empId, da, hra);
            employees.add(employee);
        }

        // Sort students and employees and print the results
        Collections.sort(students);
        System.out.println("Sorted Students by Roll No:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(employees, (e1, e2) -> Double.compare(e1.getNetSalary(), e2.getNetSalary()));
        System.out.println("Sorted Employees by Net Salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
         } catch (Exception e) {
            // Handle any exceptions that may occur during execution
            e.printStackTrace();
        }
    }
}
