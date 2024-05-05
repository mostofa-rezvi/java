package pkg22.testclassandobject;

import math.MaxMin;

public class TestMaxMin {

    public static void main(String[] args) {

        MaxMin maxMin = new MaxMin();

        maxMin.number1 = 20;
        maxMin.number2 = 30;
        maxMin.number3 = 10;

        System.out.println(maxMin.findMaxNumber());
        System.out.println(maxMin.findMinNumber());

        MaxMin mN = new MaxMin(50, 90, 20);

        // System.out.println(maxMin.number1); // defoult value for number1
        
        System.out.println("This is Max Number: " + mN.findMaxNumber());
        System.out.println(mN.findMinNumber());
    }
}
