package week5.section16;

import java.util.Scanner;

public class WhatDayIsIt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        int num = scanner.nextInt();
        scanner.nextLine();

        String dayOfTheWeek = "";

        switch (num){
            case 1:
                dayOfTheWeek = "Sunday";


            case 2:
                dayOfTheWeek = "Monday";
                break;

            case 3:
                dayOfTheWeek = "Tuesday";
                break;

            case 4:
                dayOfTheWeek = "Wednesday";
                break;

            case 5:
                dayOfTheWeek = "Thursday";
                break;

            case 6:
                dayOfTheWeek = "Friday";
                break;

            case 7:
                dayOfTheWeek = "Saturday";
                break;

            default:
                System.out.println("Invalid input");
        }

        System.out.printf("The corresponding day of the week is %s" , dayOfTheWeek);

    }
}
