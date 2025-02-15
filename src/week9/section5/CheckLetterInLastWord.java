package week9.section5;

public class CheckLetterInLastWord {


    public static void main(String[] args) {

        String[] str = {"Big", "Apple", "Harry"};

        char checkLetter = 'f';

        System.out.println(str[str.length - 1].contains(String.valueOf(checkLetter)));


    }


}
