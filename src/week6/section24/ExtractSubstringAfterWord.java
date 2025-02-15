package week6.section24;

public class ExtractSubstringAfterWord {

    public static void main(String[] args) {

        System.out.println(extractSubstringAfterWord("I love programming and coding", "programming"));
        System.out.println(extractSubstringAfterWord("Java is a popular programming language", "Python"));
        System.out.println(extractSubstringAfterWord("The quick brown fox jumps over the lazy dog", "over"));
    }

    public static String extractSubstringAfterWord(String str1, String str2){
        int indexOfWord = str1.indexOf(str2);
        int lengthOfWord = str2.length();

        if (indexOfWord == -1){
            return "";
        }

        return str1.substring(indexOfWord + lengthOfWord);

    }
}
