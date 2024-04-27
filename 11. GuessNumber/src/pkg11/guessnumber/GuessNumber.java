package pkg11.guessnumber;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//----Guess Number 01 (way)----
//
//        int number = (int) (Math.random() * 101);
//        System.out.println("Guess a magic number between 0 and 100");
//
//        System.out.print("\nEnter your guess: ");
//        int guessNumber = scanner.nextInt();
//
//        if (guessNumber == number) {
//            System.out.println("Yes, the number is " + number);
//        } else if (guessNumber > number) {
//            System.out.println("Your guess is too high");
//        } else {
//            System.out.println("Your guess is too low");
//        }
//
//        while (guessNumber != number) {
//            System.out.print("\nEnter your guess: ");
//            guessNumber = scanner.nextInt();
//            if (guessNumber == number) {
//                System.out.println("Yes, the number is " + number);
//            } else if (guessNumber > number) {
//                System.out.println("Your guess is too high");
//            } else {
//                System.out.println("Your guess is too low");
//            }
//        }
//
//
//----Guess Number 02 (way)----
//
//
//        int randomNumber = (int) (Math.random() * 101);
//
//        int maxAttempts = 3;
//        int attemptCount = 0;
//        while (attemptCount < maxAttempts) {
//            System.out.println("Please Enter your Guess Number: ");
//            int guessNumber = scanner.nextInt();
//            if (guessNumber == randomNumber) {
//                System.out.println("Congratulation");
//                break;
//            } else if (guessNumber < randomNumber) {
//                System.out.println("Your Guess Number is Lower.");
//            } else if (guessNumber > randomNumber) {
//                System.out.println("Your Guess Number is Higher");
//            }
//            attemptCount++;
//        }
//
//        if (attemptCount == maxAttempts) {
//            System.out.println("Sorry You Loss the Game and the Guess Number is " + randomNumber);
//        }
//
//
//----Guess Number 03 (way)(Sir)----
//
//
        int randomNumber = (int) (Math.random() * 101);

        int maxAttempts = 3;
        int attemptsCount = 0;

        while (attemptsCount < maxAttempts) {

            System.out.println("Pls enter ur Guess Number");
            int guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("Congratulation !");
                break;
            } else if (guessNumber < randomNumber) {
                System.out.println("Your gues number is lower");
            } else if (guessNumber > randomNumber) {
                System.out.println("Your gues number is Higher");
            }

            attemptsCount++;
        }

        if (attemptsCount == maxAttempts) {
            System.out.println("Sorry You loss the game and the guess number is " + randomNumber);

        }

    }

}
