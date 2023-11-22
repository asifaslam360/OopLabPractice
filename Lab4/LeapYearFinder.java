import java.util.Scanner;

public class LeapYearFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the starting year
        System.out.print("Enter the starting year (must be greater than 1000): ");
        int yearStart = scanner.nextInt();

        // Validate that the starting year is greater than 1000
        if (yearStart <= 1000) {
            System.out.println("Invalid input. Starting year must be greater than 1000.");
            return; // Exit the program if the input is invalid
        }

        // Prompt the user to enter the ending year
        System.out.print("Enter the ending year: ");
        int yearEnd = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Validate that the ending year is greater than the starting year
        if (yearEnd <= yearStart) {
            System.out.println("Invalid input. Ending year must be greater than the starting year.");
            return; // Exit the program if the input is invalid
        }

        // Print leap years between the starting and ending years
        System.out.println("Leap years between " + yearStart + " and " + yearEnd + ":");

        for (int year = yearStart; year <= yearEnd; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }

    // Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
