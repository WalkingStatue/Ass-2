
import MyPackage.Amazon_item;
import MyPackage.Cloth_item;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Amazon_item item1, item2;

            System.out.println("Enter details for the first cloth item:");
            System.out.print("Item ID: ");
            int item_id1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Product Type: ");
            String product_type1 = scanner.nextLine();
            System.out.print("Item Name: ");
            String item_name1 = scanner.nextLine();
            System.out.print("Item Display Price: ");
            int item_display_price1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Texture Type: ");
            String texture_type1 = scanner.nextLine();

            item1 = new Cloth_item(item_id1, product_type1, item_name1, item_display_price1, texture_type1);

            System.out.println("\nEnter details for the second cloth item:");
            System.out.print("Item ID: ");
            int item_id2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Product Type: ");
            String product_type2 = scanner.nextLine();
            System.out.print("Item Name: ");
            String item_name2 = scanner.nextLine();
            System.out.print("Item Display Price: ");
            int item_display_price2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Texture Type: ");
            String texture_type2 = scanner.nextLine();

            item2 = new Cloth_item(item_id2, product_type2, item_name2, item_display_price2, texture_type2);

            System.out.println("\nDetails of the first cloth item:");
            System.out.println(item1);
            System.out.println("\nDetails of the second cloth item:");
            System.out.println(item2);
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
