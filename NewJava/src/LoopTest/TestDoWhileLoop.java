package LoopTest;

import java.util.Scanner;

public class TestDoWhileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int randomNum = (int) (Math.random() * 100);

    System.out.println("Guess a number between 0 and 100.");

    int maxAttempt = 3;
    int minAttempt = 1;

    do {
      System.out.println("Enter you guess: ");
      int guessNum = scanner.nextInt();

      if (randomNum == guessNum) {
        System.out.println("Yes, the number is " + guessNum);
      } else if (randomNum > guessNum) {
        System.out.println("Your guess is too low.");
      } else {
        System.out.println("Your guess is too high.");
      }

      minAttempt++;
    } while (maxAttempt >= minAttempt);

    System.out.println("The random number is " + randomNum);

    scanner.close();
  }
}
