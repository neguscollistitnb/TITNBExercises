package week3.section6;

import java.util.Scanner;

public class CalculateTwoSummands {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println(num1);
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println(num2);
        int results = num1 + num2;
        System.out.println("The result is " + results);
    }
}
