import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> listOfProducts = new HashMap<String, Integer>();
    private Map<String, Integer> stockAmountOfProducts = new HashMap<String, Integer>();
    Set<String> productNames = new HashSet<>();

    // Adds a product to the warehouse with price and stock balance as parameters
    public void addProduct(String product, int price, int stock) {
        this.listOfProducts.put(product, price);
        this.stockAmountOfProducts.put(product, stock);

    }

    /* Returns the price of a produce received as a parameter
    If product has not been added to warehouse, return -99 */
    public int price(String product) {
        if (this.listOfProducts.containsKey(product)) {
            return this.listOfProducts.get(product);
        } else {
            return -99;
        }
    }

    /* Returns the current remaining stock of product in the warehouse.
    If the product hasn't been added to the warehouse, return 0 */
    public int stock(String product) {
        for (String entry : this.stockAmountOfProducts.keySet()) {
            if (entry.contains(product)) {
                return this.stockAmountOfProducts.get(entry);
            }
        }
        return 0;
    }

    /* Reduces the product's stock by 1 and returns true if there was stock remaining.
    If the product was not available, return false. Product's stock cannot go below 0. */
    public boolean take(String product) {
        int number = 0;
        for (String value : this.stockAmountOfProducts.keySet()) {
            if (value.contains(product)) {
                number = this.stockAmountOfProducts.get(product);
                if (number == 0) {
                    return false;
                } else {
                    number--;
                    this.stockAmountOfProducts.put(value, number);
                    return true;
                }
            }
        }
        return false;
    }

    // Returns the names of the products in the warehouse as a Set
    public Set<String> products() {
        for (String value : this.listOfProducts.keySet()) {
            productNames.add(value);
        }
        return productNames;
    }
}
