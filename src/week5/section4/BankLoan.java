package week5.section4;

import java.util.Scanner;

public class BankLoan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
           - credit score > 700
              -if money > 50,000
                    - good
               else
                  - not good

           - credit score < 700
                - you've been no go
         */

        int credit = 800;

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
