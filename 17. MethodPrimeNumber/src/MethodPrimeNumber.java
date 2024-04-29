
import java.util.Scanner;

public class MethodPrimeNumber {

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to check Prime Number: ");
//        int check = scanner.nextInt();
//
//        boolean result = isPrime(check);
//
//        if (result) {
//            System.out.println(check + " is a Prime Number.");
//        } else {
//            System.out.println(check + " is not a Prime Number.");
//        }
//    }
//
//    public static boolean isPrime(int number) {
//
//        int count = 0;
//
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                count++;
//            }
//        }
//
//        return count == 2;
//        
////        if (count == 2) {
////            return true;
////        } else {
////            return false;
////        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check Prime Number or not : ");
        int number = scanner.nextInt();
        
        
        findPrime(number);
    }
    
    public static void findPrime(int number){
        int count = 0 ;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number.");
        }
        else{
            System.out.println("Not a Prime Number.");
        }
    }

   

}
