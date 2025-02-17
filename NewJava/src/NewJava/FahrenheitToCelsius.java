package NewJava;

import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please Enter Temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    double result = ((fahrenheit -32)/9) * 5;

    System.out.println("Temperature in Celsius: " + result);

    scanner.close();
  }
}
