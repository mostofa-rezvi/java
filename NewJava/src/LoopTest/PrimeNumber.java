package LoopTest;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to check, is it Prime Number or not!");

    int userInput = scanner.nextInt();
    int count = 0;

    for (int i = 1; i <= userInput; i++) {

      if (userInput % i == 0) {
        count++;
      }
    }

    if (count == 2) {
      System.out.println("It is Prime Number.");
    }
    else {
      System.out.println("It is not a prime number.");
    }

    scanner.close();
  }
}
