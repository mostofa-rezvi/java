package factorialnumber;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number for Factorial: ");
        int number = scanner.nextInt();
        
        int factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("");
        System.out.println("Factorial Number is: " + factorial);
    }

}
