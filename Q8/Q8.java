import MCA.Student;
import MCA.Subject;

import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        System.out.println("Name: Dhruv Saija");
            System.out.println("Roll No: 3159");
            System.out.println("Division: B");
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter Marks for Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            Student student = new Student(studentId, studentName, address, marks);
            System.out.println("\nStudent Information:");
            System.out.println(student);

            
            System.out.print("\nEnter Subject ID: ");
            int subjectId = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Subject Name: ");
            String subjectName = scanner.nextLine();

            System.out.print("Is the Subject Elective (true/false): ");
            boolean isElective = scanner.nextBoolean();

            Subject subject = new Subject(studentId, studentName, address, marks, subjectId, subjectName, isElective);
            System.out.println("\nSubject Information:");
            System.out.println(subject);

            scanner.close();
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
