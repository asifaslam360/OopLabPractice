import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        double radius = scanner.nextDouble();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Calculate the circumference and area
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        // Print the results
        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
