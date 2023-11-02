package Mypackage;

public class Bill {
    private int Bill_id;
    private double[] item_price;
    private int total_number_of_items;
    private double total_amount;

    public Bill(int Bill_id, double[] item_price, int total_number_of_items) {
        this.Bill_id = Bill_id;
        this.item_price = item_price;
        this.total_number_of_items = total_number_of_items;
        calculate_total_amount();
    }
    public void calculate_total_amount() {
        total_amount = 0;
        for (double price : item_price) {
            total_amount += price;
        }
    }

    public double getTotal_amount() {
        return total_amount;
    }

    @Override
    public String toString() {
        return "Bill ID: " + Bill_id + "\nTotal Number of Items: " + total_number_of_items + "\nTotal Amount: " + total_amount;
    }
}
