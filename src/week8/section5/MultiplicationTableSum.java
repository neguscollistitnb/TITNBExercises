package week8.section5;

public class MultiplicationTableSum {
    public static int calculateSumInTable(int row, int column) {
        // Validate input
        if (row < 1 || row > 15 || column < 1 || column > 15) {
            return -1; // Invalid input
        }

        int sum = 0;

        // Calculate sum for the specified row
        for (int i = 1; i <= 15; i++) {
            sum += row * i;
        }

        // Calculate sum for the specified column (excluding the intersection point)
        for (int i = 1; i <= 15; i++) {
            if (i != row) { // Avoid adding the intersection point twice
                sum += i * column;
            }
        }

        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(calculateSumInTable(3, 4));  // Valid input
        System.out.println(calculateSumInTable(0, 5));  // Invalid input
        System.out.println(calculateSumInTable(10, 16)); // Invalid input
    }
}
