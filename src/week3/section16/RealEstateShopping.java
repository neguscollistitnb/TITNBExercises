package week3.section16;

import java.util.Scanner;

public class RealEstateShopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double propertyForSale = 15000000.00;
        String propertyLocation = "Beverly Hills";

        System.out.println("Enter your desired location");
        String desiredLocation = scanner.nextLine();
        System.out.println("Enter your budget:");
        double budget = scanner.nextDouble();

        boolean suitable = (budget >= propertyForSale) && propertyLocation.equals(desiredLocation);

        System.out.println("Suitable property found: " + suitable);
    }
}
