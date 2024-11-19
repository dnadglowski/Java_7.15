import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of inputs
        System.out.println("Enter the number of values you want to input:");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        Integer[] numbers = new Integer[n];

        // Read numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Use a HashSet to remove duplicates
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }
        // Convert the Set back to an array
        int[] result = new int[uniqueNumbers.size()];
        int i = 0;
        for (int num : uniqueNumbers) {
            result[i++] = num;
        }


        // Print the sorted array
        System.out.println("Sorted numbers in order: " + Arrays.toString(result));
    }
}
