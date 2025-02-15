package week7.section10;

import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "";

        while (!email.endsWith("@domain.com")) {
            System.out.print("Enter your email address: ");
            email = scanner.nextLine();

            if (!email.endsWith("@domain.com")) {
                System.out.println("Invalid input. Please enter a valid email address in the format of username@domain.com.");
            }
        } 

        System.out.println("Valid input. Thank you!");
    }
}
