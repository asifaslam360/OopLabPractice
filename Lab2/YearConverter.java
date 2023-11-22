import java.util.Scanner;

public class YearConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of years
        System.out.print("Enter the number of years: ");

        // Read the number of years from the user
        float years = scanner.nextFloat();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Convert years to months and days
        float months = years * 12;
        float days = years * 365.25f;  // Accounting for leap years (0.25 days per year)

        // Display the result
        System.out.println(years + " years is approximately equal to:");
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
