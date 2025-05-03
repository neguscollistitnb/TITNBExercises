package week5.section4;

import java.util.Scanner;

public class BankLoan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int credit = scanner.nextInt();

        if (credit < 700){
            System.out.println("no go");
        }else {
            int money = 100000;

            if (money < 50000){
                System.out.println("no good");
            }else {
                System.out.println("you good");
            }
        }

    }
}
