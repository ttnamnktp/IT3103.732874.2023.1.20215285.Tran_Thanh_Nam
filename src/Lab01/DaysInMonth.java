package Lab01;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the month
        String inputMonth;
        int month = 0;
        while (true) {
            System.out.print("Enter the month (e.g., January, Jan., Jan, 1): ");
            inputMonth = scanner.nextLine().toLowerCase();
            switch (inputMonth) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    month = 1;
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    month = 2;
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    month = 3;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    month = 4;
                    break;
                case "may":
                case "5":
                    month = 5;
                    break;
                case "june":
                case "jun.":
                case "jun":
                case "6":
                    month = 6;
                    break;
                case "july":
                case "jul.":
                case "jul":
                case "7":
                    month = 7;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    month = 8;
                    break;
                case "september":
                case "sep.":
                case "sep":
                case "9":
                    month = 9;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    month = 10;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    month = 11;
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    month = 12;
                    break;
                default:
                    System.out.println("Invalid month. Please enter a valid month.");
                    continue;
            }
            break;
        }

        // Input the year
        int year;
        while (true) {
            System.out.print("Enter the year (e.g., 1999): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    break;
                }
            }
            System.out.println("Invalid year. Please enter a non-negative integer year.");
            scanner.next(); // Clear the invalid input
        }

        // Check for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Determine the number of days in the entered month
        int daysInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        // Display the result
        System.out.println("Number of days in the selected month: " + daysInMonth);

        scanner.close();
    }
}
