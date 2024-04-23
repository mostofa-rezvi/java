package computearea01;

import java.util.Scanner;

public class ComputeArea01 {

    public static void main(String[] args) {

        // Find area:
        //
        //
//        int radius;
//        double area;
//        
//        radius = 5;
//        area = radius * radius * 3.1416;
//        
//        System.out.println(area); 
//
//
        // Find area with user input:
        //
        //
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the value of Radius: ");
//
//        int radius = input.nextInt();
//        double area = radius * radius * 3.1416;
//
//        System.out.println(area);
//
//
        // 
        // 
        //
//        Scanner input1 = new Scanner(System.in);
//        System.out.println("Please enter the height: ");
//        int height = input1.nextInt();
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Please enter the width: ");
//        int width = input2.nextInt();
//        double result = height * width;
//        System.out.println(result);
//
//
// u can use Scanner class one time in a programm
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int firstNumber = input1.nextInt();

//        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter 2nd number: ");
        int secondNumber = input1.nextInt();

//        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter 3rd number: ");
        int thirdNumber = input1.nextInt();

//        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter 4th number");
        int fourthNumber = input1.nextInt();

        double result = firstNumber + secondNumber + thirdNumber + fourthNumber;

        System.out.println("Sum: " + result);

    }

}
