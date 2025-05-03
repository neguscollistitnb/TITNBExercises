package week5.section26;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(getFactorial(5)); //120
        System.out.println(getFactorial(15l)); // 1,307,674,368,000
        System.out.println(getFactorial(45));
        System.out.println(getFactorial(2));
        System.out.println(getFactorial(123));
        System.out.println(getFactorial(-90));
        System.out.println(getFactorial(-7));
        System.out.println(getFactorial('t'));
    }

    public static long getFactorial(long num) {

        long factorial = 1;

        for (long i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
