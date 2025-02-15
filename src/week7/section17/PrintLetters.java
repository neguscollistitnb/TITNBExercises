package week7.section17;

import java.util.Scanner;

public class PrintLetters {

    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        //write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if (num > 0 && num < 27){
            System.out.println(letters.substring(0, num));
        }else {
            System.out.println("Result: Error! Invalid number");
        }
    }

}
