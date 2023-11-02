package MCA;

public class Student {
    private int student_id;
    private String student_name;
    private String address;
    private int[] marks = new int[3];
    private char grade;

    public Student(int student_id, String student_name, String address, int[] marks) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.address = address;
        this.marks = marks;
        calculateGrade();
    }

    public void calculateGrade() {
        int totalMarks = marks[0] + marks[1] + marks[2];
        int average = totalMarks / 3;

        if (average > 90) {
            grade = 'A';
        } else if (average > 80) {
            grade = 'A';
        } else if (average > 70) {
            grade = 'B';
        } else if (average > 60) {
            grade = 'B';
        } else if (average > 50) {
            grade = 'C';
        } else {
            grade = 'C';
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + student_id + "\nStudent Name: " + student_name + "\nAddress: " + address
                + "\nMarks: " + marks[0] + ", " + marks[1] + ", " + marks[2] + "\nGrade: " + grade;
    }
}
