import java.util.Scanner;

public class AverageCalculator {

    static double readAndSum(Scanner keyboard, int count) {
        double total = 0;
        int entered = 0;
        while (entered < count) {
            System.out.print("Enter number " + (entered + 1) + ": ");
            total += keyboard.nextDouble();
            entered++;
        }
        return total;
    }

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("How many numbers do you want to average? ");
            int count = keyboard.nextInt();

            if (count > 0) {
                double total = readAndSum(keyboard, count);
                System.out.printf("Sum     = %.2f%n", total);
                System.out.printf("Average = %.2f%n", total / count);
            } else {
                System.out.println("Error: please enter a positive number of values.");
            }
        }
    }
}