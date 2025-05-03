package week3.section10;

import java.util.Scanner;

public class Tweet {
    public static void main(String args[]) {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of words you want to tweet:");

        int numberOfChars = scanner.nextInt();
        boolean tweeted = false;

        if(numberOfChars <= 280){
            tweeted = true;
        }

        System.out.println("Tweeted: " + tweeted);
    }
}
