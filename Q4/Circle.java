package MyPackage;

public class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is a circle with radius " + radius;
    }
}
