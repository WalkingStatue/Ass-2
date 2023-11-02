import GTU.Supplier;
import GTU.BookSupplier;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Supplier details:");
        System.out.print("Supplier ID: ");
        int sup_id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Supplier Name: ");
        String sup_name = scanner.nextLine();
        System.out.print("Supplier Address: ");
        String address = scanner.nextLine();

        BookSupplier bookSupplier = new BookSupplier(sup_id, sup_name, address);

        bookSupplier.readProductInfo();
        bookSupplier.readDiscountInfo();
        bookSupplier.calculateTotalPrice();

        System.out.println("Supplier Information:");
        System.out.println("Supplier ID: " + bookSupplier.sup_id);
        System.out.println("Supplier Name: " + bookSupplier.sup_name);
        System.out.println("Supplier Address: " + bookSupplier.address);
        System.out.println("Total Price: " + bookSupplier.total_price);
    }
}
