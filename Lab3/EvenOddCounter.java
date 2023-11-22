import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize counters for even, odd, and zero values
        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;

        // Prompt the user to enter 10 values
        System.out.println("Enter 10 values:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Value " + i + ": ");
            int value = scanner.nextInt();

            // Check if the value is even, odd, or zero
            if (value % 2 == 0) {
                evenCount++;
            } else if (value != 0) {
                oddCount++;
            } else {
                zeroCount++;
            }
        }

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Display the results
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
