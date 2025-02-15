package week9.section17;

public class AccessingAnElementInA2DArray {

    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(accessElement2D(arrays, 2, 2));
    }

    public static int accessElement2D(int[][] array, int row, int column){
        return array[row-1][column-1];
    }
}
