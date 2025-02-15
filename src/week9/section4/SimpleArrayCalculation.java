package week9.section4;

public class SimpleArrayCalculation {

    public static void main(String[] args) {
        int[] num = {8};
        System.out.println(calculateArray(num));
    }

    public static int calculateArray(int[] numbers){
        if(numbers.length > 1){
            return numbers[0] + numbers[numbers.length - 1];
        }else {
            return 1;
        }
    }

}
