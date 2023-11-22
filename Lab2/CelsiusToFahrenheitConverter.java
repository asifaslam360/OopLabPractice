import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");

        // Read the temperature in Celsius from the user
        double celsius = scanner.nextDouble();
        // Close the Scanner to prevent resource leak
        scanner.close();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
