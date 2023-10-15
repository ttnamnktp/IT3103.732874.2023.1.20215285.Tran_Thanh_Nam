package Lab01;

import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String[] equationTypes = {
                "Solve a linear equation with one variable",
                "Solve a system of linear equations with two variables",
                "Solve a quadratic equation with one variable"
        };
        int userChoice = JOptionPane.showOptionDialog(
                null, "Choose an equation type to solve:",
                "Equation Solver", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, equationTypes, equationTypes[0]
        );

        switch (userChoice) {
            case 0:
                solveLinearEquation();
                break;
            case 1:
                solveSystemOfLinearEquations();
                break;
            case 2:
                solveQuadraticEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice");
        }
    }

    private static void solveLinearEquation() {
        String strCoefficientA = JOptionPane.showInputDialog("Enter coefficient 'a':");
        double coefficientA = Double.parseDouble(strCoefficientA);

        if (coefficientA == 0) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input: 'a' cannot be 0 in a linear equation.");
        } else {
            String strCoefficientB = JOptionPane.showInputDialog("Enter coefficient 'b':");
            double coefficientB = Double.parseDouble(strCoefficientB);
            double root = -coefficientB / coefficientA;
            JOptionPane.showMessageDialog(null, "Root (x): " + root);
        }
    }

    private static void solveSystemOfLinearEquations() {
        String strA11 = JOptionPane.showInputDialog("Enter coefficient 'a11':");
        double a11 = Double.parseDouble(strA11);
        String strA12 = JOptionPane.showInputDialog("Enter coefficient 'a12':");
        double a12 = Double.parseDouble(strA12);
        String strA21 = JOptionPane.showInputDialog("Enter coefficient 'a21':");
        double a21 = Double.parseDouble(strA21);
        String strA22 = JOptionPane.showInputDialog("Enter coefficient 'a22':");
        double a22 = Double.parseDouble(strA22);

        String strB1 = JOptionPane.showInputDialog("Enter constant 'b1':");
        double b1 = Double.parseDouble(strB1);
        String strB2 = JOptionPane.showInputDialog("Enter constant 'b2':");
        double b2 = Double.parseDouble(strB2);

        double determinant = a11 * a22 - a21 * a12;

        if (determinant == 0) {
            if (a11 / a21 == b1 / b2) {
                JOptionPane.showMessageDialog(null,
                        "Infinite solutions: The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "No solution: The system has no solution.");
            }
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            JOptionPane.showMessageDialog(null,
                    "Roots (x1, x2): " + x1 + ", " + x2);
        }
    }

    private static void solveQuadraticEquation() {
        String strCoefficientA = JOptionPane.showInputDialog("Enter coefficient 'a':");
        double coefficientA = Double.parseDouble(strCoefficientA);
        String strCoefficientB = JOptionPane.showInputDialog("Enter coefficient 'b':");
        double coefficientB = Double.parseDouble(strCoefficientB);
        String strCoefficientC = JOptionPane.showInputDialog("Enter coefficient 'c':");
        double coefficientC = Double.parseDouble(strCoefficientC);

        double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;

        if (coefficientA == 0) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input: 'a' cannot be 0 in a quadratic equation.");
        } else if (discriminant > 0) {
            double root1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            double root2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
            JOptionPane.showMessageDialog(null,
                    "Roots (x1, x2): " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double doubleRoot = -coefficientB / (2 * coefficientA);
            JOptionPane.showMessageDialog(null, "Double root: " + doubleRoot);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No real roots: The quadratic equation has no real roots.");
        }
    }
}
