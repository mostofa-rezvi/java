package NewJava;

import java.util.Scanner;

public class TryCode {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int value = scanner.nextInt();
    
    if ( value % 2 == 0) {
      System.out.println("The number is even.");
    }
    else {
      System.out.println("The number is odd.");
    }

    scanner.close();
  }
}