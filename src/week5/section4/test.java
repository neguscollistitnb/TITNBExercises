package week5.section4;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        String jobTitle = scanner.nextLine();
        double salary = scanner.nextDouble();

        System.out.printf("Dear %s,\n" +
                "Welcome to Google!\n" +
                "We are delighted to have you as a %s. Your starting salary is $%s\n" +
                "\n" +
                "Sincerely,\n" +
                "Google HR Representative" , fullName , jobTitle , salary);
    }

}
