package week7.section12;

import java.util.Scanner;

public class CalculatorAppWithMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 5;
        double num1 = 0, num2 = 0 , results = 0;
        while (choice != 0){
            System.out.println("Calculator Menu:\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "0. Exit\n" +
                    "Choose an option:");
            choice = scanner.nextInt();
            if (choice != 0) {
                System.out.println("Enter first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
            }
            switch (choice){
                case 1:
                    results = addition(num1,num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + results);
                    break;

                case 2:
                    results = subtraction(num1,num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + results);
                    break;

                case 3:
                    results = multiplication(num1,num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + results);
                    break;

                case 4:
                    results = division(num1,num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + results);
                    break;

                default:
                    System.out.println("Please nnter a valid choice");
            }
        }
        System.out.println("Exiting the calculator. Goodbye!");
    }

    public static double addition(double num1 , double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1 , double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1 , double num2){
        return num1 * num2;
    }

    public static double division(double num1 , double num2){
        return num1 / num2;
    }
}
