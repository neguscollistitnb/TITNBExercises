package week6.section11;

public class Compare3Integers {
    public static char compareIntegers(int num1, int num2, int num3){
        if ((num1 + num2) > num3){
            return  'P';
        } else if ((num1 + num2) < num3) {
            return  'N';
        } else {
            return 'E';
        }
    }
}
