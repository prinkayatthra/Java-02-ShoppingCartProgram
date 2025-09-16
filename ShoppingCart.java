import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = new String[3];
        double[] prices = new double[3];
        int[] quantities = new int[3];

        int count = 0;

        while (true) {
            System.out.println("\n1. Add item");
            System.out.println("2. View cart");
            System.out.println("3. Calculate total");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (choice == 1) {
                if (count < 3) {
                    System.out.print("Enter item name: ");
                    items[count] = scanner.nextLine();

                    System.out.print("Enter item price: ");
                    prices[count] = scanner.nextDouble();

                    System.out.print("Enter quantity: ");
                    quantities[count] = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    count++;
                    System.out.println("Item added!");
                } else {
                    System.out.println("Cart is full!");
                }
            } else if (choice == 2) {
                System.out.println("Your cart:");
                for (int i = 0; i < count; i++) {
                    System.out.println(items[i] + " - $" + prices[i] + " x " + quantities[i]);
                }
            } else if (choice == 3) {
                double total = 0;
                for (int i = 0; i < count; i++) {
                    total += prices[i] * quantities[i];
                }
                System.out.println("Total amount: $" + total);
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
