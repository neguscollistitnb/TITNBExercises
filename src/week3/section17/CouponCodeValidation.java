package week3.section17;

import java.util.Scanner;

public class CouponCodeValidation {

    public static void main(String args[]) {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your coupon:");
        String customerEnteredCoupon = scanner.nextLine();

        boolean isValidCoupon = false;

        if(customerEnteredCoupon.equals("10OFFNOW") ||
                customerEnteredCoupon.equals("SPRINGSALE") ||
                customerEnteredCoupon.equals("SAVEBIG2022") ||
                customerEnteredCoupon.equals("FEBRUARY25") ||
                customerEnteredCoupon.equals("SUMMERSALE21")){
            isValidCoupon = true;
        }

        System.out.println("The Coupon is valid: " + isValidCoupon);
    }
}
