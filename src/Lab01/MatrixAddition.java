package Lab01;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns for the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize two matrices
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(scanner, matrixA);

        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(scanner, matrixB);

        // Initialize the result matrix
        int[][] resultMatrix = new int[rows][columns];

        // Add the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Display the result matrix
        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Matrix A + Matrix B:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Function to input elements into a matrix
    public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
