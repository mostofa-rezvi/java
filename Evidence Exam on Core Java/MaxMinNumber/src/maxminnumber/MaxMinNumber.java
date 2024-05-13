package maxminnumber;

import java.util.Scanner;

public class MaxMinNumber {

    public static void main(String[] args) {

        int maxResult = maxNumber();
        System.out.println("");
        System.out.println("The maximum number is: " + maxResult);
        System.out.println("");
        
        int minResult = minNumber();
        System.out.println("");
        System.out.println("The minimum number is: " + minResult);
        System.out.println("");
    }

    public static int maxNumber() {

        Scanner scanner = new Scanner(System.in);

        int maxNumber;

        System.out.println("Enter 1st Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter 2nd Number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter 3rd Number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            maxNumber = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            maxNumber = secondNumber;
        } else {
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }
    
    public static int minNumber(){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter 2nd Number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter 3rd Number: ");
        int thirdNumber = scanner.nextInt();
        
        int minNumber;
        
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            minNumber = firstNumber;
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            minNumber = secondNumber;
        } else {
            minNumber = thirdNumber;
        }
        return minNumber;
    }

}
