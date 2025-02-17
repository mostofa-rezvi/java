package LoopTest;

import java.util.Scanner;

public class NumberWithContinue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Start Point Number: ");
    int startPoint = scanner.nextInt();
    System.out.println("Enter End Point Number: ");
    int endPoint = scanner.nextInt();

    while (startPoint < endPoint) {
      if (startPoint % 3 == 0 && endPoint % 5 == 0) {
        startPoint++;
        continue;        
      }

      System.out.println("Number is " + startPoint);
      startPoint++;
    }

    scanner.close();
  }
}
