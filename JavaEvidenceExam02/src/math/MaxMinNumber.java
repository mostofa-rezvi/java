//  Find Max and Min number from 3 numbers
package math;

import java.util.Random;

public class MaxMinNumber {

    public int MaxMin() {
        Random random = new Random();

        int num1 = random.nextInt(100); 
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Random Number 1: "+ num1);
        System.out.println("Random Number 2: " + num2);
        System.out.println("Random Number 3: " + num3);
        System.out.println("");
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        return 0;
    }

}
