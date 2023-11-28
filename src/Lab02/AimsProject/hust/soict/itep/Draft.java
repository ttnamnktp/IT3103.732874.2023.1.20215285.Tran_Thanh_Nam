package Lab02.AimsProject.hust.soict.itep;

public class Draft {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = compareStrings(str1, str2);

        System.out.println("Comparison result: " + result);
    }

    public static int compareStrings(String str1, String str2) {
        // Using compareTo method to compare strings
        int comparisonResult = str1.compareTo(str2);

        // Interpret the result
        if (comparisonResult < 0) {
            return -1; // str1 is lexicographically less than str2
        } else if (comparisonResult > 0) {
            return 1;  // str1 is lexicographically greater than str2
        } else {
            return 0;  // str1 and str2 are lexicographically equal
        }
    }
}
