package MyPackage;
import MyPackage.Amazon_item;
public class Cloth_item extends Amazon_item {
    private String texture_type;

    public Cloth_item(int item_id, String product_type, String item_name, int item_display_price, String texture_type) {
        super(item_id, product_type, item_name, item_display_price);
        this.texture_type = texture_type;
    }

    @Override
    public void calculate_net_price() {
        double discount = 0;

        if (item_display_price > 5000) {
            discount = 0.15;
        } else if (item_display_price > 4000) {
            discount = 0.10;
        } else if (item_display_price > 3000) {
            discount = 0.05;
        }

        item_net_price = (int) (item_display_price - (item_display_price * discount));
    }

    @Override
    public void display_price() {
        System.out.println("Item ID: " + item_id);
        System.out.println("Product Type: " + product_type);
        System.out.println("Item Name: " + item_name);
        System.out.println("Item Display Price: " + item_display_price);
        System.out.println("Texture Type: " + texture_type);
        System.out.println("Item Net Price: " + item_net_price);
    }
}