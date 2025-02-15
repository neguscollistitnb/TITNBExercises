package week8.section3;

public class PrintingARectangle {

    public static void main(String[] args) {
        int row = 3;
        int column = 5;
        int i = 1;

        while(i <= row){
            int j = 1;
            while (j <= column){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }


}
