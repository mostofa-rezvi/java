package NewJava;

import java.util.Scanner;

public class NewJava {

  public static void main(String[] args) {
    
    System.out.println("Please Enter the value of Radious: ");
    Scanner value = new Scanner(System.in);

    int radious = value.nextInt();
    double area = radious * radious * 3.1416;

    System.out.println(area);

    value.close();
  }
}