package week3.section20;

import java.util.Scanner;

public class SalesTax {

    public static void main(String args[]) {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the sale amount:");
        double saleAmount = scanner.nextDouble();
        System.out.println("Please enter the tax rate:");
        double taxRate = scanner.nextDouble();

        double total = saleAmount + (saleAmount * (taxRate/100));

        System.out.println(total);
    }
}
