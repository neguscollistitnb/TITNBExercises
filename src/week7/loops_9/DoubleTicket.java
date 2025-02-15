package week7.loops_9;

import java.util.Scanner;

public class DoubleTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fine = 100.00;
        boolean doubleTicket = true;

        while (doubleTicket) {
            System.out.println("The ticket fine is $ " + String.format("%.2f", fine));
            System.out.println("Do you want to double the ticket fine?");
            doubleTicket = scanner.nextBoolean();
            if (doubleTicket){
                fine *= 2;
            }
        }

        System.out.println("The ticket fine is $ " + String.format("%.2f", fine));
    }
}
