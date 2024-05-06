package math;

public class Calculator {

    int result = 0;

    public Calculator() {
    }

    public Calculator(double result) {
        this.result = (int) result;
    }

    public int calculate(int firstNumber, int secondNumber, int resultFind) {
        switch (resultFind) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber % secondNumber;
                break;
            case 5:
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}
