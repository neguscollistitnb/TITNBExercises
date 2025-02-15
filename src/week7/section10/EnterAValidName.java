package week7.section10;

import java.util.Scanner;

public class EnterAValidName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        System.out.println("Please enter your name:");
        name = scanner.nextLine();

        while (name.trim().isEmpty()){
            System.out.println("Invalid input. Please enter your name:");
            name = scanner.nextLine();
        }

        System.out.println("Welcome, " + name + "!");
    }
}
