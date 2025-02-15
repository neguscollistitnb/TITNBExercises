package week3.section1;

import java.util.Scanner;

public class BillingAddress {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your street address:");
        String streetAddress = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zipcode:");
        int zipcode = scanner.nextInt();
        System.out.printf("Entered Billing Address: %s, %s, %s, %s" , streetAddress, city, state, zipcode );
    }
}
