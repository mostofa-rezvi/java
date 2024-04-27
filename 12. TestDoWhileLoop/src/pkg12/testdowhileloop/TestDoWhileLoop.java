package pkg12.testdowhileloop;

import java.util.Scanner;

public class TestDoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 101);
        System.out.println("Guess a magic number between 0 and 100");

        int maxAttempts = 3;
        int attemptsCount = 0;

        do {
            System.out.print("\nEnter your guess: ");
            int guessNumber = scanner.nextInt();

            if (guessNumber == number) {
                System.out.println("Yes, the number is " + number);
                break;
            } else if (guessNumber > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
            attemptsCount++;
        } while (attemptsCount < maxAttempts);

        System.out.println("\nThe Guess Number is " + number);

    }

}
