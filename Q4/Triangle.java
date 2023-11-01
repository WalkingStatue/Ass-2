package MyPackage;

public class Triangle extends Shapes {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "This is a triangle with base " + base + " and height " + height;
    }
}
