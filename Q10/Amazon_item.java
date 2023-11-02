package MyPackage;

import java.util.Scanner;

public abstract class Amazon_item {
    protected int item_id;
    protected String product_type;
    protected String item_name;
    protected int item_display_price;
    protected int item_net_price;

    public Amazon_item(int item_id, String product_type, String item_name, int item_display_price) {
        this.item_id = item_id;
        this.product_type = product_type;
        this.item_name = item_name;
        this.item_display_price = item_display_price;
        calculate_net_price();
    }

    public abstract void calculate_net_price();

    public abstract void display_price();

    @Override
    public String toString() {
        return "Item ID: " + item_id + "\nProduct Type: " + product_type + "\nItem Name: " + item_name
                + "\nItem Display Price: " + item_display_price + "\nItem Net Price: " + item_net_price;
    }
}


