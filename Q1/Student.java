package MyPackageQ1;

public class Student extends Person implements Comparable<Student> {
    private int rollNo;
    private String division;
    private String dateOfBirth;

    public Student(String firstName, String middleName, String lastName, String address, int age, int rollNo, String division, String dateOfBirth) {
        super(firstName, middleName, lastName, address, age);
        this.rollNo = rollNo;
        this.division = division;
        this.dateOfBirth = dateOfBirth;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student [Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() +
                ", Roll No: " + rollNo +
                ", Division: " + division +
                ", Date of Birth: " + dateOfBirth + "]";
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.rollNo, otherStudent.getRollNo());
    }
}
