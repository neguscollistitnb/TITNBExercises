package week5.section13;

import java.util.Scanner;

public class ProductPriceCalculator {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of the product:");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        if (quantity <= 0){
            System.out.println("Quantity cannot be 0 or less");
        } else {
            System.out.println("Enter the location of the customer (USA/Canada/Other):");
            String location = scanner.nextLine();
            double cost = 0.0;

            if (location.equals("USA")){
                if (quantity < 100){
                    cost = 2.50 * quantity;
                    System.out.printf("The total cost of the product is: $%.1f" , cost);
                } else {
                    cost = 2.00 * quantity;
                    System.out.printf("The total cost of the product is: $%.1f" , cost);
                }
            } else if (location.equals("Canada")){
                if (quantity < 100){
                    cost = 3.00 * quantity;
                    System.out.printf("The total cost of the product is: $%.1f" , cost);
                } else {
                    cost = 2.50 * quantity;
                    System.out.printf("The total cost of the product is: $%.1f" , cost);
                }
            } else if (location.equals("Other")){
                if (quantity < 100){
                    cost = 3.50 * quantity;
                    System.out.printf("The total cost of the product is: $%.1f" , cost);
                } else {
                    cost = 3.00 * quantity;
                    System.out.printf("The total cost of the product is: $%.1f" , cost);
                }
            } else {
                System.out.println("Invalid location");
            }
        }
    }
}
