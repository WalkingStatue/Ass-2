import MyPackage.Shapes;
import MyPackage.Triangle;
import MyPackage.Rectangle;
import MyPackage.Circle;

public class Q4 {
    public static void main(String[] args) {
        try {
            System.out.println("Name: Dhruv Saija");
            System.out.println("Roll No: 3159");
            System.out.println("Division: B");
            Shapes shape1 = new Triangle(5.0, 4.0);
            Shapes shape2 = new Rectangle(6.0, 3.0);
            Shapes shape3 = new Circle(2.5);

            System.out.println(shape1);
            System.out.println("Area of shape1 (Triangle): " + shape1.area());

            System.out.println(shape2);
            System.out.println("Area of shape2 (Rectangle): " + shape2.area());

            System.out.println(shape3);
            System.out.println("Area of shape3 (Circle): " + shape3.area());
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
