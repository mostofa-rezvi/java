package chapter3selections;

import java.util.Scanner;

public class Chapter3Selections {

    public static void main(String[] args) {

//find maximum number
//        Scanner scanner = new Scanner(System.in);
//        
//        int maxNum;
//        
//        System.out.println("Enter First Number: ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter Second Number: ");
//        int secondNumber = scanner.nextInt();
//        System.out.println("Enter Third Number: ");
//        int thirdNumber = scanner.nextInt();
//        
//        if(firstNumber>secondNumber && firstNumber>thirdNumber){
//            maxNum=firstNumber;
//        }
//        else if(secondNumber>firstNumber && secondNumber>thirdNumber){
//            maxNum=secondNumber;
//        }
//        else{
//            maxNum=thirdNumber;
//        }
//        
//        System.out.println("Maximun Number is " + maxNum);
//
//
//
//random number find:
//            int randomNumber = (int)(Math.random()*600);
//            System.out.println(randomNumber);
//
//
//
// grade finder
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int grade = scanner.nextInt();

//        if (grade >= 79) {
//            System.out.println("Your Result is A+");
//        } else if (grade >= 69) {
//            System.out.println("Your Result is A");
//        } else if (grade >= 59) {
//            System.out.println("Your Result is A-");
//        } else if (grade >= 49) {
//            System.out.println("Your Result is B");
//        } else if (grade >= 39) {
//            System.out.println("Your Result is C");
//        } else if (grade >= 33) {
//            System.out.println("Your Result is D");
//        } else {
//            System.out.println("Your Result is F");
//        }
//
//
//

        if (grade <= 32) {
            System.out.println("Your Result is F");
        } else if (grade <= 39) {
            System.out.println("Your Result is D");
        } else if (grade <= 49) {
            System.out.println("Your Result is C");
        } else if (grade <= 59) {
            System.out.println("Your Result is B");
        } else if (grade <= 69) {
            System.out.println("Your Result is A-");
        } else if (grade <= 79) {
            System.out.println("Your Result is A");
        } else {
            System.out.println("Your Result is A+");
        }

    }

}
