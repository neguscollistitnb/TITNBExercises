package week4.section15;

import java.util.Scanner;

public class IncomeTaxCalculator {

    /*
    Develop a program that prompts the user to input their annual income as a double.
    Using if-else-if conditions and conditional operators, calculate and display the
    income tax amount based on predefined tax brackets. Assume the following tax brackets:

    Income up to $10,000: 5% tax
    Income between $10,001 and $50,000: 10% tax
    Income between $50,001 and $100,000: 20% tax
    Income over $100,000: 30% tax
    Example:
    Input:
    70000.0
    Output:
    Annual income:
    Tax amount: $14000.0
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in your income: ");
        double annualIncome = scanner.nextDouble();

        double tax = 0.0;
        double taxAmount = 0.0;

        if(annualIncome <= 10000){
            tax = 0.05;
        }else if (annualIncome >= 10001 && annualIncome <= 50000){
            tax = 0.10;
        }else if (annualIncome >= 50001 && annualIncome <= 100000){
            tax = 0.20;
        }else {
            tax = .30;
        }

        taxAmount = annualIncome * tax;
        System.out.printf("Tax amount: $%.1f" , taxAmount);
    }
}
