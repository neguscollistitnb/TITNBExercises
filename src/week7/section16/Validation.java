package week7.section16;

import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {
        validatePassword();
    }

    public static void validatePassword(){
        Scanner scanner = new Scanner(System.in);
        String password = "";

        System.out.println("Enter a password:");
        password = scanner.nextLine();

        while (password.length() < 8){
            System.out.println("Password must be at least 8 characters long.");
            System.out.println("Enter a password:");
            password = scanner.nextLine();
        }
        System.out.println("Registration successful!");
    }
}
