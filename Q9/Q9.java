import Mypackage.Supplier;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input supplier information
            System.out.print("Enter Supplier ID: ");
            int supplierId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            String[] productNames = new String[3];
            double[] productPrices = new double[3];

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter Product Name " + (i + 1) + ": ");
                productNames[i] = scanner.nextLine();

                System.out.print("Enter Price of Product " + (i + 1) + ": ");
                productPrices[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline
            }

            Supplier supplier = new Supplier(supplierId, supplierName, address, productNames, productPrices);
            System.out.println("\nSupplier Information:");
            System.out.println(supplier);

            scanner.close();
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
