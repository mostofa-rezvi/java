package NewJava;

import java.util.Scanner;

public class lenth {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter First value: ");
    double length = input.nextDouble();

    System.out.println("Enter Second Value: ");
    double width = input.nextDouble();

    double area = length * width;

    System.out.println(area);

    input.close();
  }
}
