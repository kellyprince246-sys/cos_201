import java.util.Scanner;

public class ItemCost {

    static boolean isValidInput(double unitPrice, int quantity) {
        return unitPrice >= 0 && quantity >= 0;
    }

    static double calculateTotal(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter the item name: ");
            String itemName = keyboard.nextLine();

            System.out.print("Enter the unit price: ");
            double unitPrice = keyboard.nextDouble();

            System.out.print("Enter the quantity: ");
            int quantity = keyboard.nextInt();

            if (isValidInput(unitPrice, quantity)) {
                double total = calculateTotal(unitPrice, quantity);
                System.out.printf("%nItem:       %s%n", itemName);
                System.out.printf("Unit price: %.2f%n", unitPrice);
                System.out.printf("Quantity:   %d%n", quantity);
                System.out.printf("Total cost: %.2f%n", total);
            } else {
                System.out.println("Error: price and quantity cannot be negative.");
            }
        }
    }
}