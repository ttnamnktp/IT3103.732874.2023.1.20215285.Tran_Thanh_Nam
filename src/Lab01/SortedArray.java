package Lab01;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        // Define the numeric array
        int[] numbers = {10, 5, 7, 2, 8, 15};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Calculate the sum and average of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        // Display the sorted array, sum, and average
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);
    }
}
