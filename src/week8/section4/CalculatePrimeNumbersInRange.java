package week8.section4;

public class CalculatePrimeNumbersInRange {

    public static void main(String[] args) {
        System.out.println(calculatePrimeNumbersInRange(1,1000));
    }

    public static int calculatePrimeNumbersInRange(int start, int end) {
        int sum = 0;
        boolean foundPrime = false;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            // Check if num is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If num is prime, print it and add to sum
            if (isPrime && num > 1) {
                sum += num;
                foundPrime = true;
            }
        }

        if (!foundPrime) {
            return 0;
        }

        return sum;
    }
}
