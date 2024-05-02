package pkg21.testtwodinmensionalarray;

import java.util.Arrays;

public class TestTwoDinmensionalArray {

    /*
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(array));
    }
     */
    // Sum Two Dimensional Array

    
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int sum = doSum(array);
        
        System.out.println(sum);
        
        System.out.println(Arrays.deepToString(array));
    }

    public static int doSum(int[][] myArray) {

        int sum = 0;

        for (int row = 0; row < myArray.length; row++) {
            for (int column = 0; column < myArray[0].length; column++) {
                sum += myArray[row][column];
            }
        }
        return sum;
    }

    
    /*
    public static void main(String[] args) {
        int[][] newArray = {{5, 7, 5}, {5, 9, 4}, {6, 4, 2}};

        int sum = doSumOfArray(newArray);

        System.out.println(sum);

        System.out.println(Arrays.deepToString(newArray));
    }

    public static int doSumOfArray(int[][] arrays) {
        int sum = 0;
        for (int row = 0; row < arrays.length; row++) {
            for (int column = 0; column < arrays[0].length; column++) {
                sum += arrays.length;
            }
        }
        return sum;
    }
    */

}
