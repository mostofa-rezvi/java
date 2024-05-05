package pkg22.testclassandobject;

import math.PrimeNumber;

public class TestPrimeNumber {

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber(18);

        boolean prime = primeNumber.getPrimeNumber();

        if (prime) {
            System.out.println("This is a Prime Number.");
        } else {
            System.out.println("This is not a Prime Number.");
        }
    }
}
