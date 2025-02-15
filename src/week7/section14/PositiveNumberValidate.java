package week7.section14;

import java.util.Scanner;

public class PositiveNumberValidate {

    public static void main(String[] args) {
        validateInput();
    }

    public static void validateInput(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a positive integer:");
        do {
            num = scanner.nextInt();
            if (num <= 0){
                System.out.println("Error: Please enter a positive integer.");
            }
        } while (num <= 0);
        System.out.println("Valid number: " + num);
    }
}
