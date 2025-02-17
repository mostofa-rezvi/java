package Gmail;

import java.util.Scanner;

public class LogIn {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // System.out.println("Enter Your Email ID: ");
    // String userEmail = scanner.next();
    // String message = String.format("Welcome %s to GMail.", userEmail);

    // if (userEmail.equalsIgnoreCase("java")) {
    //   System.out.println("Enter Your Password: ");
    //   String password = scanner.next();
    //   if (password.equals("java")) {
    //     System.out.println(message);
    //   }
    //   else {
    //     System.out.println("Incorret Password.");
    //   }
    // }
    // else {
    //   System.out.println("Couldn't find your gmail account.");
    // }

    System.out.print("Enter your user name: ");
    String userName = scanner.next();
    System.out.print("Enter your password: ");
    String password = scanner.next();

    String message = String.format("Welcome to Facebook, %s.", userName);

    if (userName.equalsIgnoreCase("java") && password.equals("JAVA")) {
      System.out.println(message);
    }
    else {
      System.out.println("Invalid User or Password.");
    }

    scanner.close();
  }
}
