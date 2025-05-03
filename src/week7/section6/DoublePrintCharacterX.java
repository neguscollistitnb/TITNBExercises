package week7.section6;

public class DoublePrintCharacterX {


    public static void main(String[] args) {

        DoublePrintCharacterX dpc = new DoublePrintCharacterX();

        String sentence = "Extra";
        dpc.printStringWithX(sentence);

        dpc.test1();


    }

    public void test1(){

    }
    public void test2(){

    }
    public void test3(){

    }
    public void test4(){

    }
    public void test5(){

    }
    public void test6(){

    }

    public  void printStringWithX(String sentence){
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
