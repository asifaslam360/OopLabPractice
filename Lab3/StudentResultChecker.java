import java.util.Scanner;

public class StudentResultChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Calculate the average marks
        double average = (subject1 + subject2 + subject3) / 3;

        // Check if the average is above 50 and print the result
        if (average > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
