//  Find factorial of any number
package math;

public class FactorialNumber {

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }

}
