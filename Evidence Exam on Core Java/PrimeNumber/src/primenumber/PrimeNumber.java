package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter a number to check Prime Number: ");
        int number = scanner.nextInt();
        
        System.out.println("");
        if (primeNumber(number)) {
            System.out.println(primeNumber(number)+ ", " + number + " is a Prime number");
        } else{
            System.out.println(primeNumber(number)+ ", " + number + " is not a Prime number");
        }
        
    }
    
    public static boolean primeNumber(int number){
        int count = 0;
        
        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        return count==2;
    }
    
    
    
 
    
    
    
////With-out Method:
//    
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Enter a number to check Prime number: ");
//        int number = scanner.nextInt();
//        
//        int count = 0;
//        
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                count++;
//            }
//        }
//        
//        System.out.println("");
//        
//        if (count==2) {
//            System.out.println("The Prime number is: " + number);
//        } else {
//            System.out.println("The " + number + " is not a Prime Number");
//        }
//    }

}
