import java.util.Scanner;

public class SimpleCalculator {

    static boolean isValidOperator(char operator) {
        return "+-*/".indexOf(operator) >= 0;
    }

    static double calculate(double firstNumber, char operator, double secondNumber) {
        if (operator == '+') {
            return firstNumber + secondNumber;
        } else if (operator == '-') {
            return firstNumber - secondNumber;
        } else if (operator == '*') {
            return firstNumber * secondNumber;
        } else {
            return firstNumber / secondNumber;
        }
    }

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double firstNumber = keyboard.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = keyboard.next().charAt(0);

            System.out.print("Enter the second number: ");
            double secondNumber = keyboard.nextDouble();

            if (!isValidOperator(operator)) {
                System.out.println("Error: invalid operator '" + operator + "'.");
            } else if (operator == '/' && secondNumber == 0) {
                System.out.println("Error: division by zero is not allowed.");
            } else {
                double answer = calculate(firstNumber, operator, secondNumber);
                System.out.printf("%.2f %c %.2f = %.2f%n",
                        firstNumber, operator, secondNumber, answer);
            }
        }
    }
}