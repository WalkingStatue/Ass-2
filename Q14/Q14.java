import Mypackage.Person;
import Mypackage.Employee;
import Mypackage.Manager;

public class Q14 {
    public static void main(String[] args) {
        System.out.println("Name: Dhruv Saija");
        System.out.println("Roll No: 3159");
        System.out.println("Division: B");
        Person[] people = new Person[2];

        Employee employee = new Employee("John", 50000);
        Manager manager = new Manager("Alice", 80000);

        people[0] = employee;
        people[1] = manager;

        for (Person person : people) {
            try {
                person.hikeSalary(10);
                person.displayData();
            } catch (IllegalArgumentException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
