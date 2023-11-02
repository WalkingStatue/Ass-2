package GTU;
import java.util.Scanner;
public class BookSupplier extends Supplier {
    private int[] discount;

    public BookSupplier(int sup_id, String sup_name, String address) {
        super(sup_id, sup_name, address);
        discount = new int[3];
    }

    @Override
    public void calculateTotalPrice() {
        super.calculateTotalPrice();
        for (int i = 0; i < 3; i++) {
            total_price -= (price_of_product[i] * discount[i] / 100);
        }
    }

    public void readDiscountInfo() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter discount for " + product_name[i] + " (%): ");
            try {
                discount[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input for discount. Please enter a valid number.");
                discount[i] = 0;
            }
        }
    }
}
