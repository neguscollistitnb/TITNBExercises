package week1.section9;

public class Pelindrome {



    public static void main(String[] args) {
        String word = "CIVIC";

        StringBuilder newWord = new StringBuilder();

        for (int i = word.length() -1; i >= 0; i--){
            newWord.append(word.charAt(i));
        }

        System.out.println("False");
    }
}
