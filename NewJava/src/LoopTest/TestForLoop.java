package LoopTest;

import java.util.Scanner;

public class TestForLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number for factorial: ");
    int input = scanner.nextInt();
    int factorial = 1;

    for (int i = 1; i <= input; i++) {
      factorial *= i;
    }
    System.out.println("Factorial is " + factorial);

    scanner.close();
  }
}
