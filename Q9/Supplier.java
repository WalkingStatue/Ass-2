package Mypackage;

public class Supplier {
    private int sup_id;
    private String sup_name;
    private String address;
    private String[] product_name = new String[3];
    private double[] price_of_product = new double[3];
    private double total_price;

    public Supplier(int sup_id, String sup_name, String address, String[] product_name, double[] price_of_product) {
        this.sup_id = sup_id;
        this.sup_name = sup_name;
        this.address = address;
        this.product_name = product_name;
        this.price_of_product = price_of_product;
        calculateTotalPrice();
    }

    public void calculateTotalPrice() {
        total_price = price_of_product[0] + price_of_product[1] + price_of_product[2];
    }

    @Override
    public String toString() {
        return "Supplier ID: " + sup_id + "\nSupplier Name: " + sup_name + "\nAddress: " + address
                + "\nProduct Names: " + product_name[0] + ", " + product_name[1] + ", " + product_name[2]
                + "\nProduct Prices: " + price_of_product[0] + ", " + price_of_product[1] + ", " + price_of_product[2]
                + "\nTotal Price: " + total_price;
    }
}
