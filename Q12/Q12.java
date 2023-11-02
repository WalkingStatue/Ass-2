import java.util.Scanner;
import Mypackage.Bill;
public class Q12 {
    public static void main(String[] args) {
        System.out.println("Name: Dhruv Saija");
            System.out.println("Roll No: 3159");
            System.out.println("Division: B");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Bill ID: ");
            int Bill_id = scanner.nextInt();
            System.out.print("Enter the total number of items: ");
            int total_number_of_items = scanner.nextInt();
            double[] item_price = new double[total_number_of_items];
            for (int i = 0; i < total_number_of_items; i++) {
                System.out.print("Enter price for item " + (i + 1) + ": ");
                double price = scanner.nextDouble();

                if (price < 0) {
                    throw new IllegalArgumentException("Item price cannot be negative.");
                }

                item_price[i] = price;
            }

            Bill bill = new Bill(Bill_id, item_price, total_number_of_items);

            System.out.println("\nBill Details:");
            System.out.println(bill);
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
