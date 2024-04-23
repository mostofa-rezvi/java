package fahrenheittocelsius;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
//      Fahrenheit To Celsius
        Scanner inputTempareture = new Scanner(System.in);
        System.out.println("Enter tempareture in Fahrenheit: ");

        float fahrenheitTempareture = inputTempareture.nextFloat();

        float result = ((fahrenheitTempareture - 32) / 9) * 5;

        System.out.println("Tempareture in Celsius: " + result);

//    Celsius To Fahrenheit
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Enter Tempareture in Celsius: ");

        float celsiusTempareture = inputTemp.nextFloat();
        float tempResult = ((celsiusTempareture * 9) / 5) + 32;

        System.out.println("Tempareture in Fahrenheit: " + tempResult);
    }

}
