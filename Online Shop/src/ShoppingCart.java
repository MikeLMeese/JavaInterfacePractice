import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    // Adds item to cart that matches product given as parameter. Also lists price of product
    public void add(String product, int price) {
        if (!this.cart.containsKey(product)) {
            Item item = new Item(product, 1, price);
            this.cart.put(product, item);
        } else if (this.cart.containsKey(product)) { // Conditional to update quantity of item
            Item item = this.cart.get(product);
            item.increaseQuantity();
        }

    }

    // Returns total price of cart
    public int price() {
        int sum = 0;
        for (Item value : this.cart.values()) {
            sum += value.price();
        }
        return sum;
    }

    // Method to print items in the cart
    public void print() {
        for (String product : this.cart.keySet()) {
            System.out.println(this.cart.get(product));
        }
    }
}
