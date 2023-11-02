package shape;

import geometry.Circle;
import geometry.Figure;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Name: Dhruv Saija");
            System.out.println("Roll No: 3159");
            System.out.println("Division: B");
        Scanner scanner = new Scanner(System.in);

        try {
            Figure figure1, figure2, figure3, figure4;

            System.out.print("Enter 'R' for Rectangle or 'C' for Circle for figure1: ");
            char choice1 = scanner.next().charAt(0);
            if (choice1 == 'R' || choice1 == 'r') {
                System.out.print("Enter the width and length for the Rectangle: ");
                double width = scanner.nextDouble();
                double length = scanner.nextDouble();
                figure1 = new Rectangle(width, length);
            } else if (choice1 == 'C' || choice1 == 'c') {
                System.out.print("Enter the radius for the Circle: ");
                double radius = scanner.nextDouble();
                figure1 = new Circle(radius);
            } else {
                System.out.println("Invalid choice. Please enter 'R' or 'C'.");
                return;
            }
            System.out.print("Enter 'R' for Rectangle or 'C' for Circle for figure2: ");
            char choice2 = scanner.next().charAt(0);
            if (choice2 == 'R' || choice2 == 'r') {
                System.out.print("Enter the width and length for the Rectangle: ");
                double width = scanner.nextDouble();
                double length = scanner.nextDouble();
                figure2 = new Rectangle(width, length);
            } else if (choice2 == 'C' || choice2 == 'c') {
                System.out.print("Enter the radius for the Circle: ");
                double radius = scanner.nextDouble();
                figure2 = new Circle(radius);
            } else {
                System.out.println("Invalid choice. Please enter 'R' or 'C'.");
                return;
            }

            System.out.print("Enter 'R' for Rectangle or 'C' for Circle for figure3: ");
            char choice3 = scanner.next().charAt(0);
            if (choice3 == 'R' || choice3 == 'r') {
                System.out.print("Enter the width and length for the Rectangle: ");
                double width = scanner.nextDouble();
                double length = scanner.nextDouble();
                figure3 = new Rectangle(width, length);
            } else if (choice3 == 'C' || choice3 == 'c') {
                System.out.print("Enter the radius for the Circle: ");
                double radius = scanner.nextDouble();
                figure3 = new Circle(radius);
            } else {
                System.out.println("Invalid choice. Please enter 'R' or 'C'.");
                return;
            }

            System.out.print("Enter 'R' for Rectangle or 'C' for Circle for figure4: ");
            char choice4 = scanner.next().charAt(0);
            if (choice4 == 'R' || choice4 == 'r') {
                System.out.print("Enter the width and length for the Rectangle: ");
                double width = scanner.nextDouble();
                double length = scanner.nextDouble();
                figure4 = new Rectangle(width, length);
            } else if (choice4 == 'C' || choice4 == 'c') {
                System.out.print("Enter the radius for the Circle: ");
                double radius = scanner.nextDouble();
                figure4 = new Circle(radius);
            } else {
                System.out.println("Invalid choice. Please enter 'R' or 'C'.");
                return;
            }
            System.out.println("Area of figure1: " + figure1.area());
            System.out.println("Area of figure2: " + figure2.area());
            System.out.println("Area of figure3: " + figure3.area());
            System.out.println("Area of figure4: " + figure4.area());

            if (figure1.getClass() == Circle.class) {
                System.out.println("Perimeter of figure1: " + ((Circle) figure1).perimeter());
            }
            if (figure2.getClass() == Circle.class) {
                System.out.println("Perimeter of figure2: " + ((Circle) figure2).perimeter());
            }

            if (figure3.getClass() == Circle.class) {
                System.out.println("Perimeter of figure3: " + ((Circle) figure3).perimeter());
            }

            if (figure4.getClass() == Circle.class) {
                System.out.println("Perimeter of figure4: " + ((Circle) figure4).perimeter());
            }

            scanner.close();
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
