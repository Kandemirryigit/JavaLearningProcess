import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {

        if (product.reduceStock(quantity)) {
            items.add(new CartItem(product, quantity));
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Not enough stock.");
        }
    }

    public void removeProduct(String productName) {

        for (CartItem item : items) {
            if (item.getProduct().getName().equalsIgnoreCase(productName)) {
                item.getProduct().increaseStock(item.getQuantity());
                items.remove(item);
                System.out.println("Product removed.");
                return;
            }
        }

        System.out.println("Product not found in cart.");
    }

    public void showCart() {

        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (CartItem item : items) {
            System.out.println(
                item.getProduct().getName() +
                " | Quantity: " + item.getQuantity() +
                " | Total: $" + item.getTotalPrice()
            );
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (CartItem item : items) {
            total += item.getTotalPrice();
        }

        return total;
    }
}