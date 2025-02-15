package week7.section6;

public class DoublePrintCharacterX {


    public static void main(String[] args) {


        String sentence = "Extra";
        printStringWithX(sentence);


    }

    public static void printStringWithX(String sentence){
        String str = "";

        int strLength = sentence.length();
        int index = 0;

        while(index < strLength){

            if (sentence.charAt(index) == 'X'){
                str += "X" + sentence.charAt(index);
            }else if (sentence.charAt(index) == 'x') {
                str += "x" + sentence.charAt(index);
            } else {
                str += sentence.charAt(index);
            }
            index++;
        }

        System.out.println(str);
    }


}
