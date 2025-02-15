package week3.section6;

import java.util.Scanner;

public class QuizWithChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Question 1: What is the capital of France?\n" +
                "A. Paris\n" +
                "B. London\n" +
                "C. Rome\n" +
                "Enter your answer:");
        String answer = scanner.nextLine();
        System.out.println(answer);
        System.out.println();
        System.out.println("Question 2: What is the square root of 16?\n" +
                "A. 2\n" +
                "B. 4\n" +
                "C. 8\n" +
                "Enter your answer:");
        answer = scanner.nextLine();
        System.out.println(answer);
        System.out.println();
        System.out.println("Question 3: What is the correct syntax to output \"Hello World\" in Java?\n" +
                "A. print(\"Hello World\");\n" +
                "B. Console.WriteLine(\"Hello World\");\n" +
                "C. System.out.println(\"Hello World\");\n" +
                "Enter your answer:");
        answer = scanner.nextLine();
        System.out.println(answer);
    }
}
