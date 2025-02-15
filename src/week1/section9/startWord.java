package week1.section9;

public class startWord {

    public static void main(String[] args) {
        startWord("hippo", "hi"); // "hi"
        startWord("hippo", "xip"); // "hip"
        startWord("hippo", "i"); // "h"


        String temp = "Hello";
        System.out.println(temp.substring( 2));
    }

    /*
    Given a string and a second "word" string, we'll say that the word matches the string if it
    appears at the front of the string, except its first char does not need to match exactly.
    On a match, return the front of the string, or otherwise return the empty string.
    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
    The word will be at least length 1.
     */

    public static String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        if (word.length() == 1) {
            return str.substring(0, 1); //hippo
        }

        String sub = str.substring(1, word.length());
        String wordSub = word.substring(1);

        if (sub.equals(wordSub)) {
            return str.substring(0, word.length());
        }

        return "";

    }
}
