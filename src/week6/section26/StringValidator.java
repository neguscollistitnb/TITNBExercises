package week6.section26;

public class StringValidator {

    public static boolean validateString(String str){
        String trimmedStr = str.trim();
        return trimmedStr.length() > 0 && trimmedStr.equals(str);
    }
}
