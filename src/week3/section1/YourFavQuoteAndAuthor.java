package week3.section1;

import java.util.Scanner;

public class YourFavQuoteAndAuthor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite quote?");
        String quote = scanner.nextLine();
        System.out.println("Who is the author?");
        String author = scanner.nextLine();

        System.out.println("\"" + quote + "\"" + " - " + author);
    }
}
