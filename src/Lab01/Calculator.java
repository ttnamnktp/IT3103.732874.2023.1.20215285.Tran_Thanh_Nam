package Lab01;
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        // Nhap 2 so thuc
        String input1 = JOptionPane.showInputDialog("Enter the first double number:");
        String input2 = JOptionPane.showInputDialog("Enter the second double number:");

        // Convert
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        // Calculate
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : 0;

        // result message
        String resultMessage = "Sum: " + sum + "\nDifference: " + difference +
                "\nProduct: " + product + "\nQuotient: " + quotient;

        // Display
        JOptionPane.showMessageDialog(null, resultMessage,
                "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}

