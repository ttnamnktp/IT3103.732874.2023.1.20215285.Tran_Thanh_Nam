package Lab01;

import java.util.Scanner;

public class StaredTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces to align the stars to the right
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the stars for this row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }

        scanner.close();
    }
}
