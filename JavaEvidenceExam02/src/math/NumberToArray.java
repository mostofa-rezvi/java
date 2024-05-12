//   Add 10 number to an Array from user
package math;

import java.util.Arrays;
import java.util.Scanner;

public class NumberToArray {

    Scanner scanner = new Scanner(System.in);

    public void arrayNumber() {
//  public void arrayNumber(){

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Pls enter value for " + (i + 1));
            int userInput = scanner.nextInt();

            array[i] = userInput;

        }
        System.out.println(Arrays.toString(array));
//        return array;
    }

}
