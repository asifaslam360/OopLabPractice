import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to display its multiplication table: ");

        // Read the number from the user
        int number = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Print the multiplication table
        System.out.println("Multiplication table for " + number + ":");

        // Print each line of the multiplication table
        int result1 = number * 1;
        System.out.println(number + " * 1 = " + result1);

        int result2 = number * 2;
        System.out.println(number + " * 2 = " + result2);

        int result3 = number * 3;
        System.out.println(number + " * 3 = " + result3);

        int result4 = number * 4;
        System.out.println(number + " * 4 = " + result4);

        int result5 = number * 5;
        System.out.println(number + " * 5 = " + result5);

        int result6 = number * 6;
        System.out.println(number + " * 6 = " + result6);

        int result7 = number * 7;
        System.out.println(number + " * 7 = " + result7);

        int result8 = number * 8;
        System.out.println(number + " * 8 = " + result8);

        int result9 = number * 9;
        System.out.println(number + " * 9 = " + result9);

        int result10 = number * 10;
        System.out.println(number + " * 10 = " + result10);
    }
}
