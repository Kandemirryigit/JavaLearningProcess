import java.util.Scanner;

public class ECommerceSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product laptop = new Product("Laptop", 1000, 5);
        Product phone = new Product("Phone", 600, 10);

        ShoppingCart cart = new ShoppingCart();

        int choice;

        do {
            System.out.println("\n1. Add Laptop");
            System.out.println("2. Add Phone");
            System.out.println("3. Show Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    cart.addProduct(laptop, 1);
                    break;

                case 2:
                    cart.addProduct(phone, 1);
                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:
                    System.out.println("Total: $" + cart.calculateTotal());
                    break;

                case 5:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}