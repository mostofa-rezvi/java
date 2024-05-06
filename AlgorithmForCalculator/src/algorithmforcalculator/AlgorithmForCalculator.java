package algorithmforcalculator;

import java.util.Scanner;
import math.Calculator;

public class AlgorithmForCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Addition, Enter 1: \n Subtraction, Enter 2: \n Multiplication, Enter 3: \n Modulus, Enter 4: \n Division, Enter 5: ");

        int resultFind = scanner.nextInt();

        Calculator cal = new Calculator();

        int result = cal.calculate(firstNumber, secondNumber, resultFind);
        System.out.println("Your answer is: " + result);

    }
}
