package Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        // Define the numeric array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Calculate the sum and average of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / length;

        // Display the sorted array, sum, and average
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);
    }
}
