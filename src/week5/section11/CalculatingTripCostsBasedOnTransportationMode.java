package week5.section11;

import java.util.Scanner;

public class CalculatingTripCostsBasedOnTransportationMode {

    public static void main(String[] args) {

        /*
        - drive or fly.  - if else statement
        - get the distance
        - calculate the cost
        - if flying and first class extra 50
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the distance of the trip in miles:");
        int miles = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the mode of transportation (drive/fly):");
        String travelMethod = scanner.nextLine();

        double cost = 0.0;

        if (travelMethod.equals("drive")){
            cost = miles * .50;
            System.out.printf("The cost of the trip is $%.2f" , cost);
        }else  if (travelMethod.equals("fly")){
            System.out.println("Do you want to fly first class (yes/no)?");
            String firstClass = scanner.nextLine();

            int flightTime = miles / 500;

            if (miles > 0) {
                if (firstClass.equals("yes")) {
                    cost = (flightTime * 100) + 50;
                    System.out.printf("The cost of the trip is $%.2f" , cost);
                } else {
                    cost = flightTime * 100;
                    System.out.printf("The cost of the trip is $%.2f" , cost);
                }
            }else {
                System.out.println("Invalid distance value, please enter a positive value.");
            }
        } else {
            System.out.println("Invalid mode of transportation!");
        }
    }

}
