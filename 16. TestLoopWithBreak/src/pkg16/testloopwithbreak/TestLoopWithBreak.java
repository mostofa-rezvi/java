package pkg16.testloopwithbreak;

import java.util.Scanner;

public class TestLoopWithBreak {

    public static void main(String[] args) {

//----Loop (Break) ----
//
//        Scanner scanner = new Scanner(System.in);
//        
//        int sum = 0;
//        
//        while(true){
//            System.out.println("Enter Value: ");
//            int userInput = scanner.nextInt();
//            sum += userInput;
//            
//            if(sum >=100){
//                System.out.println("Sum is " + sum);
//                break;
//            }
//        }
//
//
//---- Loop (Continue) ----
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter Value: ");
//            int userInput = scanner.nextInt();
//            sum += userInput;
//
//            if (sum >= 200) {
//                
//            } else if (sum >= 100) {
//                continue;
//            }
//            System.out.println("Sum is " + sum);
//        }
//
//
//
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start Value: ");
        int startValue = scanner.nextInt();
        System.out.println("Enter End Value: ");
        int endValue = scanner.nextInt();

        while (startValue < endValue) {

            if (startValue % 3 != 0 || startValue % 5 != 0) {
                startValue++;
                continue;
            } else {
                System.out.println("Value is " + startValue);
            }
            startValue++;
        }

    }

}
