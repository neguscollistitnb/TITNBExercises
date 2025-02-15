package week3.section5;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("" + firstName.charAt(0) + lastName.charAt(0));

    }

}
