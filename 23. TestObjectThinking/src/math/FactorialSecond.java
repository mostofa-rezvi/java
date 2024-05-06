package math;

import java.math.BigInteger;

public class FactorialSecond {

    int number;

    public FactorialSecond() {
    }

    public FactorialSecond(int number) {
        this.number = number;
    }

    public BigInteger getFactorial() {

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }

        return factorial;
    }

    public boolean findPrime() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return (true);
        }
        return (false);
    }
}
