import MyPackage.Exam;
import MyPackage.Classify;

public class Q5 implements Exam, Classify {
    private int mark;
    private int average;

    // Constructor
    public Q5(int mark, int average) {
        this.mark = mark;
        this.average = average;
    }

    // Getter for mark
    public int getMark() {
        return mark;
    }

    // Setter for mark
    public void setMark(int mark) {
        this.mark = mark;
    }

    // Getter for average
    public int getAverage() {
        return average;
    }

    // Setter for average
    public void setAverage(int average) {
        this.average = average;
    }

    // Implement the Pass method from Exam interface
    @Override
    public boolean Pass(int mark) {
        return mark >= 50;
    }

    // Implement the Division method from Classify interface
    @Override
    public String Division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No division";
        }
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "Mark: " + mark + ", Average: " + average;
    }

    public static void main(String[] args) {
        try {
            Q5 result = new Q5(75, 65);
            System.out.println("Pass: " + result.Pass(result.getMark()));
            System.out.println("Division: " + result.Division(result.getAverage()));
            System.out.println(result.toString());
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
