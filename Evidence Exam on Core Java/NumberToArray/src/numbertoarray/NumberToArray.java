package numbertoarray;

import java.util.Arrays;
import java.util.Scanner;

public class NumberToArray {

    public static void main(String[] args) {

       int[] arrayNumber = new int[10];
       
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Enter the value for array " + (i+1));
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            
            arrayNumber[i] = input;
        }
        System.out.println(Arrays.toString(arrayNumber));
    }

}
