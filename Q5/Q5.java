import MyPackage.Exam;
import MyPackage.Classify;

public class Q5 implements Exam, Classify {
    private int mark;
    private int average;

    public Q5(int mark, int average) {
        this.mark = mark;
        this.average = average;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public boolean Pass(int mark) {
        return mark >= 50;
    }

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

    @Override
    public String toString() {
        return "Mark: " + mark + ", Average: " + average;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Name: Dhruv Saija");
            System.out.println("Roll No: 3159");
            System.out.println("Division: B");
            Q5 result = new Q5(75, 65);
            System.out.println("Pass: " + result.Pass(result.getMark()));
            System.out.println("Division: " + result.Division(result.getAverage()));
            System.out.println(result.toString());
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
