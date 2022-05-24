public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    // Constructor that takes product, product quantity, and product price as parameters
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;

    }

    // Method that returns the price of items
    public int price() {
        int price = 0;
        price = this.unitPrice * this.qty;
        return price;
    }

    // Method that increases quantity by 1
    public void increaseQuantity() {
        this.qty++;
    }

    // Overriden toString method
    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}