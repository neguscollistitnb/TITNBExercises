package week3.section3;

import java.util.Scanner;

public class TotalCompensationAtGoogle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your annual base salary:");
        double salary = scanner.nextDouble();
        System.out.println("Please enter the amount paid in stocks per year:");
        double stockOptions = scanner.nextDouble();
        System.out.println("Please enter the bonus percentage from the base salary:");
        double bonus = (scanner.nextDouble() / 100) * salary;

        int total = (int) (salary + stockOptions + (bonus));

        System.out.println("Your annual total compensation is: " + total);
    }
}
