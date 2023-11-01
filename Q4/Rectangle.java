package MyPackage;

public class Rectangle extends Shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "This is a rectangle with length " + length + " and width " + width;
    }
}
