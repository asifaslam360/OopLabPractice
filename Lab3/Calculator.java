import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number (a)
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        // Prompt the user to enter the second number (b)
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (a + b)");
        System.out.println("2: Subtraction (a - b)");
        System.out.println("3: Multiplication (a * b)");
        System.out.println("4: Division (a / b)");
        System.out.println("5: Modulo or Remainder (a % b)");

        // Read the operation choice from the user
        System.out.print("Enter the operation (1-5): ");
        int operationChoice = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Perform the selected operation and display the result
        double result = 0;

        switch (operationChoice) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot calculate modulo with zero as the divisor.");
                }
                break;
            default:
                System.out.println("Invalid operation choice. Please choose a number between 1 and 5.");
        }
    }
}
