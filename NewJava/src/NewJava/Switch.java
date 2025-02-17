package NewJava;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please Enter Day Number: ");
    int numberOfDay = scanner.nextInt();

    String dayName;

    switch (numberOfDay) {
      case 1:
        dayName = "Saturday";
        break;
      case 2:
        dayName = "Sunday";
        break;
      case 3:
        dayName = "Monday";
        break;
      case 4:
        dayName = "Tuesday";
        break;
      case 5:
        dayName = "Wednesday";
        break;
      case 6:
        dayName = "Thursday";
        break;
      case 7:
        dayName = "Friday";
        break;
      default:
        dayName = "Invalid Day Number.";
        break;
    }

    System.out.println("Your Desier Day Name is " + dayName);

    System.out.println("Please Enter Your First Number: ");
    double num1 = scanner.nextDouble();

    System.out.println("Please Enter Your Second Number: ");
    double num2 = scanner.nextDouble();

    System.out.println("For Addition(+) Press: 1");
    System.out.println("For Subtraction(-) Press: 2");
    System.out.println("For Multiplication(*) Press: 3");
    System.out.println("For Division(/) Press: 4");

    int choice = scanner.nextInt();
    double result = 0.0f;

    switch (choice) {
      case 1:
        result = num1 + num2;
        break;
      case 2:
        result = num1 - num2;
        break;
      case 3:
        result = num1 * num2;
        break;
      case 4:
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid Choice.");
        break;
    }

    System.out.println("Result is  " + result);

    scanner.close();
  }
}
