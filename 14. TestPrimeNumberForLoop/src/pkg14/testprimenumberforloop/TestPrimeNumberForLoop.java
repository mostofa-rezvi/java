
package pkg14.testprimenumberforloop;

import java.util.Scanner;

public class TestPrimeNumberForLoop {


    public static void main(String[] args) {
        
        
        //---- 1 to 100 Prime Number ----
//        Scanner scanner = new Scanner(System.in);
//        //System.out.println("Enter number to check Prime or not prime");
//
//        // int userInput = scanner.nextInt();
//        int count = 0;
//
//        for (int j = 1; j <= 100; j++) {
//            for (int i = 1; i <= j; i++) {
//
//                if (j % i == 0) {
//                    count++;// count=1 count=2
//                }
//            }
//
//            if (count == 2) {
//                System.out.println(j);
//            }
//
//            count = 0;
//        }
//
//
////---- Prime Number ----
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check Prime Number: ");
        int primeNumber = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= primeNumber; i++) {
            if (primeNumber % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(primeNumber + " is a Prime Number.");
        } else {
            System.out.println(primeNumber + " is not a Prime Number.");
        }
    }
    
}
