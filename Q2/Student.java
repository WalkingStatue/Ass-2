package MyPackage;

public class Student extends Person {
    private int rollNumber;
    private String address;
    private double percentage;

    public Student(String firstName, String lastName, int age, int rollNumber, String address, double percentage) {
        super(firstName, lastName, age);
        this.rollNumber = rollNumber;
        this.address = address;
        this.percentage = percentage;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void display() {
        super.display(); // Call the display method of the base class
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address);
        System.out.println("Percentage: " + percentage);
    }
}
