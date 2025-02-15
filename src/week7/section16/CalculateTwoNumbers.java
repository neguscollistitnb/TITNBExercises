package week7.section16;

import java.util.Scanner;

public class CalculateTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0 , num2 = 0;
        String operator = "";
        String wantToContinue = "y";

        while (wantToContinue.toLowerCase().trim().equals("y")){
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter operator (+, -, *, /): ");
            operator = scanner.nextLine();

            if(operator.trim().equals("+")){
                System.out.println("Results: " + (num1 + num2));
            } else if (operator.trim().equals("-")) {
                System.out.println("Results: " + (num1 - num2));
            }else if (operator.trim().equals("*")) {
                System.out.println("Results: " + (num1 * num2));
            }else if (operator.trim().equals("/")) {
                System.out.println("Results: " + (num1 / num2));
            } else {
                System.out.println("Invalid operator!");
            }
            System.out.print("Do you want to continue? (y/n) ");
            wantToContinue = scanner.nextLine();
            System.out.println();
        }
    }
}

