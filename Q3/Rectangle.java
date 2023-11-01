package MyPackage;

public class Rectangle {
    private double length;
    private double width;
    private static int objectCount = 0;

    {
        System.out.println("Initializer block is executed.");
    }

    static {
        System.out.println("Static initializer block is executed.");
    }

    public Rectangle() {
        length=10;
        width=20;
        objectCount++;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        objectCount++;
    }
    
    public Rectangle(Rectangle otherRectangle) {
         this.length = otherRectangle.length;
        this.width =  otherRectangle.width;
        objectCount++;
    }

    public double findArea() {
        return length * width;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    @Override
    public String toString() {
        return "Rectangle [Length: " + length + ", Width: " + width + "]";
    }

    public static void main(String[] args) {
        try {
            Rectangle rectangle1 = new Rectangle(5.0, 3.0);
            Rectangle rectangle2 = new Rectangle();
            Rectangle rectangle3 = new Rectangle(rectangle1);

            System.out.println("Rectangle 1: " + rectangle1);
            System.out.println("Rectangle 2: " + rectangle2);
            System.out.println("Rectangle 3: " + rectangle3);

            System.out.println("Area of Rectangle 1: " + rectangle1.findArea());
            System.out.println("Number of Rectangle objects created: " + Rectangle.getObjectCount());
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
