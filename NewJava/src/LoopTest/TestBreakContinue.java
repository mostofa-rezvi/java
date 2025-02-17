package LoopTest;

import java.util.Scanner;

public class TestBreakContinue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    
    while (true) {
      System.out.println("Enter Value: ");
      int userInput = scanner.nextInt();
      sum += userInput;

      if (sum >= 100) {
        System.out.println("Sum is " + sum);
        break;
      }
    }

    scanner.close();
  }
}
