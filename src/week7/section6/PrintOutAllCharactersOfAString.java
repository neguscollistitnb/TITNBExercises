package week7.section6;

public class PrintOutAllCharactersOfAString {

    public static void main(String[] args) {

        String str = "Hello World";
        splitCharacters(str);

    }

    public static void splitCharacters(String str){
        int strLength = str.length();

        int index = 0;

        while (index < strLength){
            System.out.println(str.charAt(index));
            index++;
        }
    }

}
