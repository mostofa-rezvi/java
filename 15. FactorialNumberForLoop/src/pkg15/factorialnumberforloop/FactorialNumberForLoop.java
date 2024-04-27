
package pkg15.factorialnumberforloop;

import java.util.Scanner;

public class FactorialNumberForLoop {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
//
//
////----- Factorial Number Finder -----
////---- int statement ----
//
        System.out.println("Enter a number: ");
        int factorialValue = scanner.nextInt();
        int factorial = 1;

//--- Style 01        
//        for (int i = 1; i <= factorialValue; i++) {
//            factorial *= i;
//        }
//---Style 02        
        for (int i = factorialValue; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Factorial is " + factorial);
//
//
////---- long Statement ----
//        System.out.println("Enter a number: ");
//        long factorialValue = scanner.nextInt();
//        long factorial = 1;
//
////--- Style 01        
////        for (long i = 1; i <= factorialValue; i++) {
////            factorial *= i;
////        }
////---Style 02        
//        for (long i = factorialValue; i >= 1; i--) {
//            factorial *= i;
//        }
//
//        System.out.println("Factorial is " + factorial);
//
//
//
    }
    
}
