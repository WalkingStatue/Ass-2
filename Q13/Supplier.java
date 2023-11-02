package GTU;
import java.util.Scanner;
public class Supplier {
    public int sup_id;
    public String sup_name;
    public String address;
    public String[] product_name;
    public double[] price_of_product;
    public double total_price;

    public Supplier(int sup_id, String sup_name, String address) {
        this.sup_id = sup_id;
        this.sup_name = sup_name;
        this.address = address;
        this.product_name = new String[3];
        this.price_of_product = new double[3];
        this.total_price = 0.0;
    }

    public void calculateTotalPrice() {
        for (int i = 0; i < 3; i++) {
            total_price += price_of_product[i];
        }
    }

    public void readProductInfo() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter product name #" + (i + 1) + ": ");
            product_name[i] = scanner.nextLine();
            System.out.println("Enter price for " + product_name[i] + ": ");
            try {
                price_of_product[i] = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input for price. Please enter a valid number.");
                price_of_product[i] = 0.0;
            }
            scanner.nextLine(); // Consume the newline character
        }
    }
}
